
package programacompramatricula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{
    private JPanel panel;
    private JTextField txtCodigo;
    private JButton btnBuscar;
    private JLabel titulo; 
    private JLabel mensaje; 
    private String codigoSis;
    public Ventana(){
        setSize(620,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        this.setResizable(false);
        agregarPanel();
        codigoSis = "";
        this.setVisible(true);
    }
    private void agregarPanel(){
      panel = new JPanel();
      panel.setBackground(Color.LIGHT_GRAY);
      panel.setLayout(null);
      getContentPane().add(panel);
      agregarTitulo();
      agregarMensaje();
      agregarBotonBuscar();
      agregarJtxtCodigo();
    }
    private void agregarMensaje(){
     mensaje = new JLabel();
        mensaje.setText("Ingrese codigo SIS");
        mensaje.setBounds(60,115, 300, 30);
        mensaje.setForeground(Color.BLACK);
        mensaje.setFont(new Font("Arial", 0, 25));
        panel.add(mensaje);
       
    }
    private void agregarBotonBuscar(){
      btnBuscar = new JButton("Buscar");
      btnBuscar.setBounds(350, 170, 110, 47);
      btnBuscar.setBackground(Color.DARK_GRAY);
      btnBuscar.setForeground(Color.WHITE);
      btnBuscar.setBorder(new RoundedBorder(40));
      panel.add(btnBuscar);
      ActionListener oyente = new ActionListener() {
           @Override
             public void actionPerformed(ActionEvent e) {
                  if (!((txtCodigo.getText()).equals(""))) {
                      codigoSis = txtCodigo.getText();
                      boolean esNumerico;
                      esNumerico = codigoSis.matches("[+-]?\\d*(\\.\\d+)?");
                      if(esNumerico && codigoSis.length()==9){
                          try {
                              buscarEnLaBaseDeDatos();
                          } catch (SQLException ex) {
                              Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                          }
                      }else{
                         JOptionPane.showMessageDialog(null, "Verifique el codigo SIS", "Advertencia", JOptionPane.WARNING_MESSAGE);
                       }
                  }else {
                        
                   }

           }

         };

        btnBuscar.addActionListener(oyente);
      
    }
    
    private void buscarEnLaBaseDeDatos() throws SQLException{
        String CodSis = txtCodigo.getText();
        
        try{
            Statement sql = Conexion.getConexion().createStatement();
            //Queery que se ejecuta en la tabla estudiantes
            String consulta = "SELECT * FROM estudiantes WHERE condigo_sis ="+ CodSis;
            //envio de Query
            ResultSet resultado = sql.executeQuery(consulta);
            
            resultado.next();
            //Envio de datos a la ventana resultado
            VentanaResultado ventResultado = new VentanaResultado(resultado.getInt(1), resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(7),resultado.getString(5),resultado.getString(6),resultado.getString(10),resultado.getString(8),resultado.getString(9));   
            eliminar();
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "NO EXISTE EL ALUMNO");
        }
    }
    private void agregarJtxtCodigo(){
        txtCodigo = new JTextField("");
        txtCodigo.setBounds(60, 170, 280, 45);
        txtCodigo.setBackground(Color.WHITE);
        panel.add(txtCodigo);
        
    }
    private void agregarTitulo(){
       titulo = new JLabel();
        titulo.setText("Buscador");
        titulo.setBounds(200, 35, 200, 40);
        titulo.setForeground(Color.BLACK);
        titulo.setFont(new Font("cooper black", 0, 40));
        panel.add(titulo);
    }
    
    private void eliminar(){
          this.dispose();
      }

}




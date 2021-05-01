
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
<<<<<<< HEAD
    private void buscarEnLaBaseDeDatos(){
      
      VentanaResultado ventResultado = new VentanaResultado("Gabriela", "Martinez","Grebara","29/05/2021","201801256",9568559,"cbba","Ingeniería de Sistemas","Tecnología");
=======
    private void buscarEnLaBaseDeDatos() throws SQLException{
        String bases = "";
        String CodSis = txtCodigo.getText();
        
        try{
            Statement sql = Conexion.getConexion().createStatement();
            
            String consulta = "SELECT * FROM Estudiantes WHERE condigo_sis ="+ CodSis;
            
            ResultSet resultado = sql.executeQuery(consulta);
            
            resultado.next();
            bases += "Id = "+ resultado.getString(3)+"\n"
                    +" Nombres = "+ resultado.getString(2)+"\n" 
                    +" Apellido Paterno = "+resultado.getString(3)+"\n"
                    +" Apellido Materno = "+resultado.getString(4)+"\n"
                    +" Condigo Sis = "+resultado.getString(5)+"\n"
                    +" CI = "+resultado.getString(6)+"\n"
                    +" Fecha Nacimiento = "+resultado.getString(7)+"\n";
               

            JOptionPane.showMessageDialog(null, bases);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "NO EXISTE EL ALUMNO");
        }
>>>>>>> c9f257914d1627304b07bff4fcc5ebce0f21f5e5
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
}




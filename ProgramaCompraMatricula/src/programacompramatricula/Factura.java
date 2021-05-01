
package programacompramatricula;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Factura extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    
    private JButton imprimir;
    private JButton cancelar;
    
    private JLabel titulo;
    private JLabel periodo;
    private JLabel facultad;
    private JLabel carrera;
    private JLabel estudiante;
    private JLabel codigoSis;
    private JLabel precio;
    
    String carreraEstudiante;
    String codigoSisEstudiante;
    String nombreEstudiante;

    public Factura(String carreraE, String codigoSisE, String nombreE) {
        setSize(950, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        agregarPanel1();
        carreraEstudiante = carreraE;
        codigoSisEstudiante = codigoSisE;
        nombreEstudiante = nombreE;
        agregarPanel2();
        this.setVisible(true);
    }
    private void agregarPanel1(){
        panel1 = new JPanel();
        FlowLayout posicion = new FlowLayout(FlowLayout.CENTER, 1, 10);
        panel1.setLayout(posicion);
        panel1.setBackground(Color.BLACK);
        agregarTitulo();
        getContentPane().add(panel1, BorderLayout.NORTH);
    }
    private void agregarPanel2(){
        panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);
        panel2.setLayout(null);
        getContentPane().add(panel2, BorderLayout.CENTER);
        agregarMensajes();
        botonImprimir();
        botonCancelar();
    }
    private void agregarMensajes(){
        periodo = new JLabel();
        periodo.setText("Periodo: 1-2021");
        periodo.setBounds(50, 55, 500, 40);
        periodo.setForeground(Color.WHITE);
        periodo.setFont(new Font("Arial", 0, 28));
        panel2.add(periodo);
        
        facultad = new JLabel();
        facultad.setText("Facultad: CIENCIAS Y TECNOLOGIA");
        facultad.setBounds(50, 105, 500, 40);
        facultad.setForeground(Color.WHITE);
        facultad.setFont(new Font("Arial", 0, 28));
        panel2.add(facultad);
        
        carrera = new JLabel();
        carrera.setText("Carrera: "+carreraEstudiante);
        carrera.setBounds(50, 155, 500, 40);
        carrera.setForeground(Color.WHITE);
        carrera.setFont(new Font("Arial", 0, 28));
        panel2.add(carrera);
        
        estudiante = new JLabel();
        estudiante.setText("Estudiante: "+nombreEstudiante);
        estudiante.setBounds(50,205 , 500, 40);
        estudiante.setForeground(Color.WHITE);
        estudiante.setFont(new Font("Arial", 0, 28));
        panel2.add(estudiante);
        
        codigoSis = new JLabel();
        codigoSis.setText("Codido Sis: "+codigoSisEstudiante);
        codigoSis.setBounds(590, 205, 600, 40);
        codigoSis.setForeground(Color.WHITE);
        codigoSis.setFont(new Font("Arial", 0, 28));
        panel2.add(codigoSis);
        
        precio = new JLabel();
        precio.setText("Son: Catorce 0/100 bs.       14.00");
        precio.setBounds(50, 255, 600, 40);
        precio.setForeground(Color.WHITE);
        precio.setFont(new Font("Arial", 0, 28));
        panel2.add(precio);
    }
    private void botonImprimir(){
      
    }
    private void botonCancelar(){
    
    }
    private void agregarTitulo(){
        titulo = new JLabel();
        titulo.setText("RECIBO DE FACTURA");
        titulo.setBounds(192, 20, 500, 80);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("cooper black", 0, 40));
        panel1.add(titulo);
    }
}

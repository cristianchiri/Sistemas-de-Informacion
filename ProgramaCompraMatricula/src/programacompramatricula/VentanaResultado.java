package programacompramatricula;

import javax.swing.*;
import java.awt.*;
public class VentanaResultado extends JFrame{
    private JPanel panel;
    private JButton btnImprimir;
    private JButton btnNuevaBusqueda;
    private JLabel titulo;
    private JLabel nombreLabel; 
    private JLabel nombreLabelValor;
    //Datos del estudiante
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;
    private String codigoSis;
    private int ci;
    private String expedido;
    private String carrera;
    private String facultad;

    public VentanaResultado(String n,String ap, String am, String fn, String cs,int ci, String ex,String c, String f){
        
        nombre = n;
        apellidoPaterno=ap;
        apellidoMaterno=am;
        fechaNacimiento=fn;
        codigoSis=cs;
        this.ci =ci;
        expedido = ex;
        carrera = c;
        facultad=f;
        setSize(1100,750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        this.setResizable(false);
        agregarPanel();
        this.setVisible(true);
    }
    private void agregarPanel(){
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        getContentPane().add(panel);
        agregarTitulo();
        agregarBotonImprimir();
        agregarBotonNuevaBusqueda();
        agregarDatos();
      }
      private void agregarDatos(){
        //FILA 1
            //columna 1 nombre
            nombreLabel = new JLabel();
            nombreLabel.setText("Nombre(s)");
            nombreLabel.setBounds(50, 120, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(nombre);
            nombreLabelValor.setBounds(50, 150, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
            //columna 2 apellido paterno
            nombreLabel = new JLabel();
            nombreLabel.setText("Apellido Paterno: ");
            nombreLabel.setBounds(450, 120, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(apellidoPaterno);
            nombreLabelValor.setBounds(450, 150, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
            //columna 3 apellido materno
            nombreLabel = new JLabel();
            nombreLabel.setText("Apellido Materno: ");
            nombreLabel.setBounds(830, 120, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(apellidoMaterno);
            nombreLabelValor.setBounds(830, 150, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
        //FILA 2
            //columna 1 nombre
            nombreLabel = new JLabel();
            nombreLabel.setText("Fecha Nacimiento(dd/mm/aaaa)/:");
            nombreLabel.setBounds(200, 250, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(fechaNacimiento);
            nombreLabelValor.setBounds(200, 280, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
            //columna 2 apellido paterno
            nombreLabel = new JLabel();
            nombreLabel.setText("Código SIS: ");
            nombreLabel.setBounds(600, 250, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(codigoSis);
            nombreLabelValor.setBounds(600, 280, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
        //FILA 3
            //columna 1 nombre
            nombreLabel = new JLabel();
            nombreLabel.setText("Tipo de Documento");
            nombreLabel.setBounds(50, 380, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText("CI");
            nombreLabelValor.setBounds(50, 410, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
            //columna 2 apellido paterno
            nombreLabel = new JLabel();
            nombreLabel.setText("Número Documento: ");
            nombreLabel.setBounds(450, 380, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(String.valueOf(ci));
            nombreLabelValor.setBounds(450, 410, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
            //columna 3 apellido materno
            nombreLabel = new JLabel();
            nombreLabel.setText("Expedido en: ");
            nombreLabel.setBounds(830, 380, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(expedido);
            nombreLabelValor.setBounds(830, 410, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
        //FILA 4
            //columna 1 nombre
            nombreLabel = new JLabel();
            nombreLabel.setText("Carrera:");
            nombreLabel.setBounds(200, 510, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(carrera);
            nombreLabelValor.setBounds(200, 540, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
            //columna 2 apellido paterno
            nombreLabel = new JLabel();
            nombreLabel.setText("Facultad: ");
            nombreLabel.setBounds(600, 510, 200, 40);
            nombreLabel.setForeground(Color.BLACK);
            nombreLabel.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabel);
            nombreLabelValor = new JLabel();
            nombreLabelValor.setText(facultad);
            nombreLabelValor.setBounds(600, 540, 200, 40);
            nombreLabelValor.setForeground(Color.BLACK);
            nombreLabelValor.setBackground(Color.LIGHT_GRAY);
            nombreLabelValor.setOpaque(true);
            nombreLabelValor.setFont(new Font("Arial", 0,18));
            panel.add(nombreLabelValor);
        }
        private void agregarTitulo(){
           titulo = new JLabel();
            titulo.setText("DATOS DEL ESTUDIANTE");
            titulo.setBounds(260, 70, 600, 40);
            titulo.setForeground(Color.BLACK);
            titulo.setFont(new Font("Arial", 0, 40));
            panel.add(titulo);
        }
        private void agregarBotonImprimir(){
            btnImprimir = new JButton("Imprimir");
            btnImprimir.setBounds(300, 650, 110, 40);
        btnImprimir.setBackground(Color.DARK_GRAY);
        btnImprimir.setForeground(Color.WHITE);
        btnImprimir.setBorder(new RoundedBorder(40));
        panel.add(btnImprimir);
        
      }
      private void agregarBotonNuevaBusqueda(){
        btnNuevaBusqueda = new JButton("Nueva Busqueda");
        btnNuevaBusqueda.setBounds(650,650,150,40);
        btnNuevaBusqueda.setBackground(Color.DARK_GRAY);
        btnNuevaBusqueda.setForeground(Color.WHITE);
        btnNuevaBusqueda.setBorder(new RoundedBorder(40));
        panel.add(btnNuevaBusqueda);
      }
}

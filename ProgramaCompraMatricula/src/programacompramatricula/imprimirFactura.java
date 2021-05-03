package programacompramatricula;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;
import javax.swing.*;
public class imprimirFactura extends JFrame{
    private JButton botonImprimir;
    public Factura impresion;
    public imprimirFactura(){
        initComponents();
    }
    
    public static void main(String args[]){
        imprimirFactura impF= new imprimirFactura();
    }
    
    private void initComponents() {
        impresion = new Factura("Ingeniería Informática", "20180256", "Nicolas Alarcon");
        impresion.imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        impresion.cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "LA IMPRESIÓN SE CANCELÓ");
                impresion.dispose();
            }
        });
    }
    
    private void imprimirActionPerformed(ActionEvent evt) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(impresion);        
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN " + ex);
            }
        }
    }
   
    public void interfazImpresion(){
        try {
            for (UIManager.LookAndFeelInfo info :UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(imprimirFactura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(imprimirFactura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(imprimirFactura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(imprimirFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new imprimirFactura().setVisible(true);
        });
    }
}

package vistas;

import clases.Contacto;
import clases.Numero;
import clases.Tipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * La clase VistaNumeros representa la interfaz gráfica para gestionar los números de contacto.
 * Permite agregar, eliminar y visualizar números asociados a un contacto.
 * 
 * @author Carlos Lara - Jerardo Morales - Hawer Morelos - Diego Arias - Yeshua Martínez
 */
public class VistaNumeros extends javax.swing.JFrame {

    // Atributos
    Contacto c;                  // Contacto asociado a los números
    VistaContactos vc;           // Referencia a la vista de contactos
    ArrayList<Tipo> tipos;       // Lista de tipos de contactos
    DefaultTableModel modelo;    // Modelo para la tabla de datos
    static int codigo = 1;        // Código de número (para asignar a nuevos números)

    /**
     * Constructor de la clase VistaNumeros.
     * 
     * @param c Contacto asociado a los números.
     * @param vc Referencia a la vista de contactos.
     * @param tipos Lista de tipos de contactos.
     */
    public VistaNumeros(Contacto c, VistaContactos vc, ArrayList<Tipo> tipos) {
        initComponents();
        this.c = c;
        this.vc = vc;
        this.tipos = tipos;
        this.vc.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NUMERO");
        modelo.addColumn("TIPO DE CONTACTO");
        this.jlContacto.setText(c.getNombre() + " " + c.getApellido());

        jcCombox.addItem("Seleccione");
        for(int i=0; i<this.tipos.size(); i++){
            jcCombox.addItem(this.tipos.get(i).getNombre());
        }

        mostrarDatos();
    }

    /**
     * Método para mostrar los datos en la tabla de la interfaz gráfica.
     */
    public void mostrarDatos() {
        modelo.setNumRows(this.c.getNumeros().size());
        for (int i = 0; i < this.c.getNumeros().size(); i++) {
            modelo.setValueAt(this.c.getNumeros().get(i).getCodigo(), i, 0);
            modelo.setValueAt(this.c.getNumeros().get(i).getNumero(), i, 1);
            modelo.setValueAt(this.c.getNumeros().get(i).getTipo().getNombre(), i, 2);
        }
        jtDatos.setModel(modelo);
    }

    // Otro código generado por NetBeans IDE

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        char c = evt.getKeyChar();
        if (c >= '0' && c <= '9') {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Guardar un nuevo número de contacto
        if (tfNumero.getText().length() == 8 && jcCombox.getSelectedIndex() > 0) {
            Numero n = new Numero();
            n.setCodigo(codigo);
            codigo++;
            n.setNumero(tfNumero.getText());
            tfNumero.setText("");
            n.setTipo(this.tipos.get(jcCombox.getSelectedIndex() - 1));
            this.c.getNumeros().add(n);
            this.mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS SOLICITADOS, EL NUMERO DEBE SER DE 8 DIGITOS");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Eliminar un número de contacto seleccionado
        if (jtDatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL NUMERO A ELIMINAR");
        } else {
            this.c.getNumeros().remove(jtDatos.getSelectedRow());
            this.mostrarDatos();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Cancelar y volver a la vista de contactos
        this.dispose();
        this.vc.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaNumeros(new Contacto(), new VistaContactos(), new ArrayList<>()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCombox;
    private javax.swing.JLabel jlContacto;
    private javax.swing.JTable jtDatos;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}

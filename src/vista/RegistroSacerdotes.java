/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JTextFieldDateEditor;
import entidades.Guardian;
import entidades.Sacerdote;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import service.GuardianService;
import service.SacerdoteService;

/**
 *
 * @author Cristian
 */
public class RegistroSacerdotes extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroSacerdotes
     */
    public RegistroSacerdotes() {
        initComponents();
        setLocation(190, 40);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) datechooser.getDateEditor();
        editor.setEditable(false);
        btnModificar.setEnabled(false);
       
        btnInhabilitar.setEnabled(false);
        txtId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        datechooser = new com.toedter.calendar.JDateChooser();
        rbActivo = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnInhabilitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setBorder(null);
        setTitle("Registro Sacerdotes");
        setPreferredSize(new java.awt.Dimension(900, 600));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Dni :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setText("Apellido :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("Nombre :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setText("Telefono :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setText("Fecha Nacimiento : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setText("Estado : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        txtApellido.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 223, -1));

        txtDni.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 223, -1));

        txtTelefono.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 223, -1));

        txtNombre.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 223, -1));

        datechooser.setDateFormatString("yyyy-MM-dd");
        datechooser.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        datechooser.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        getContentPane().add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 220, -1));

        rbActivo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        rbActivo.setText("ACTIVO");
        getContentPane().add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 147, -1));

        btnBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 114, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 48, -1));

        btnModificar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        btnInhabilitar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnInhabilitar.setText("INHABILITAR");
        btnInhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInhabilitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInhabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        jButton1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 730, 107, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 380, 320));

        btnSalir.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 137, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        SacerdoteService s = new SacerdoteService();
        
        String dni = txtDni.getText();
        String apellido = txtApellido.getText();
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String fechaNac = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        boolean estado = rbActivo.isSelected();
        
        s.crearSacerdote(dni, apellido, nombre, telefono, LocalDate.parse(fechaNac), estado);
        JOptionPane.showMessageDialog(this, "Sacerdote Guardado!");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if (txtDni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un documento a buscar");
            } else {
                
               
                btnModificar.setEnabled(true);
                btnInhabilitar.setEnabled(true);
                btnGuardar.setEnabled(false);
                String dni = txtDni.getText();
                
                SacerdoteService ss = new SacerdoteService();
                Sacerdote aux = new Sacerdote();
                //Guardamos en un Sacerdote los valores obtenidos por el método
                aux = ss.buscarSacerdotePorDNI(dni);
                // utilizamos la informacioon del Sacerdote para setear los campos
                txtId.setText("" + aux.getIdSacerdote());
                txtApellido.setText(aux.getApellido());
                txtNombre.setText(aux.getNombre());                
                txtTelefono.setText(aux.getTelefono());
                //Forma de setear el DateChooser
                LocalDate localDate = aux.getFechaNacimiento();
                java.util.Date utilDate = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                datechooser.setDate(utilDate);
                //Forma de setear el radioButon
                if (aux.isEstado() == true) {
                    rbActivo.setSelected(true);
                } else {
                    rbActivo.setSelected(false);
                }
                
            }
        } catch (NullPointerException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "No hay Sacerdotes con ese dni en la base de datos");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            
            int id = Integer.parseInt(txtId.getText());
            
            String dni = txtDni.getText();
            String apellido = txtApellido.getText();
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String fechaNac = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
            boolean estado = rbActivo.isSelected();
            
            SacerdoteService ss = new SacerdoteService();
            ss.modificarSacerdote(id, dni, apellido, nombre, telefono, LocalDate.parse(fechaNac), estado);
            this.dispose();
            
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInhabilitarActionPerformed
        
        try {
            int id = Integer.parseInt(txtId.getText());
            SacerdoteService ss = new SacerdoteService();
            ss.inhabilitarSacerdote(id);
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Sacerdote para su Inhabilitacion");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al analizar los datos");
        }
        
    }//GEN-LAST:event_btnInhabilitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        limpiarCampos();
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
       
        btnInhabilitar.setEnabled(false);
    }//GEN-LAST:event_formMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnInhabilitar;
    public static javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    public static com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JRadioButton rbActivo;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtDni;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtApellido.setText("");
        txtDni.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        datechooser.setDate(null);
        rbActivo.setSelected(false);
    }
}

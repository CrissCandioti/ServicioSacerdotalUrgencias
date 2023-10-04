/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JTextFieldDateEditor;
import entidades.Guardian;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import service.GuardianService;

/**
 *
 * @author Cristian
 */
public class RegistroGuardianes extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroGuardianes
     */
    public RegistroGuardianes() {
        initComponents();
        this.setLocation(190, 30);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) DateChooser.getDateEditor();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        rbActivo = new javax.swing.JRadioButton();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        cbxRol = new javax.swing.JComboBox<>();
        DateChooser = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtApelldo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInhabilitar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("Registro Guardianes");
        setPreferredSize(new java.awt.Dimension(1200, 900));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Apellido :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 103, 37));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 103, 37));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("Telefono :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 103, 37));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setText("Dirección :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 103, 37));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setText("Rol :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 103, 37));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setText("Estado civil :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, 37));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText("Fecha Nac.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 120, 37));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel8.setText("Estado :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 103, 37));

        txtDni.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 242, 40));

        txtNombre.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 242, 40));

        txtTelefono.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 242, 40));

        txtDireccion.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 242, 40));

        rbActivo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        rbActivo.setSelected(true);
        rbActivo.setText("ACTIVO");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });
        getContentPane().add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "casado", "soltero", "viudo", "separado" }));
        getContentPane().add(cbxEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 242, 32));

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Vocal", "Telefonista", "Chofer", "Acompañante" }));
        getContentPane().add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 242, 32));

        DateChooser.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 242, -1));

        btnGuardar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setOpaque(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 130, -1));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setText("Dni :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 103, 37));

        txtApelldo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        getContentPane().add(txtApelldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 242, 40));

        btnBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 110, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, -1));

        btnModificar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 120, 40));

        btnEliminar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 120, -1));

        btnInhabilitar.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnInhabilitar.setText("Inhabilitar");
        btnInhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInhabilitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInhabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, -1, -1));

        btnSalir.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 700, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            
       
        GuardianService gs= new GuardianService();
        
        String dni = txtDni.getText();
        String apellido = txtApelldo.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String fechaNac = ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
        String estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        String rol = cbxRol.getSelectedItem().toString();
        boolean estado = rbActivo.isSelected();
        
        gs.crearGuardian(dni, apellido, nombre, direccion, telefono, LocalDate.parse(fechaNac), estadoCivil, rol, estado);
        limpiarCampos();
            
         } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
             if (txtDni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un documento a buscar");
            }else{
            
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnInhabilitar.setEnabled(true);
            btnGuardar.setEnabled(false);
            String dni = txtDni.getText();
            
            GuardianService gs = new GuardianService();
            Guardian aux = new Guardian();
            
            //Guardamos en un Guardian los valores obtenidos por el método
            aux = gs.buscarGuardianPorDNI(dni);
            // utilizamos la informacioon del Guardian para setear los campos
            txtId.setText("" + aux.getIdGuardian());
            txtApelldo.setText(aux.getApellido());
            txtNombre.setText(aux.getNombre());
            txtDireccion.setText(aux.getDireccion());
            txtTelefono.setText(aux.getTelefono());
            //Forma de setear el DateChooser
            LocalDate localDate = aux.getFechaNacimiento();
            java.util.Date utilDate = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            DateChooser.setDate(utilDate);
            //Forma de setear el radioButon
            if (aux.isEstado() == true) {
                rbActivo.setSelected(true);
            } else {
                rbActivo.setSelected(false);
            }
            cbxEstadoCivil.setSelectedItem(aux.getEstadoCivil());
            cbxRol.setSelectedItem(aux.getRol());
            
             }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            
       
        GuardianService gs= new GuardianService();
        int id = Integer.parseInt(txtId.getText());
        String dni = txtDni.getText();
        String apellido = txtApelldo.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String fechaNac = ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
        String estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        String rol = cbxRol.getSelectedItem().toString();
        boolean estado = rbActivo.isSelected();
        
        gs.modificarGuardian(id, dni, apellido, nombre, direccion, telefono, LocalDate.parse(fechaNac), estadoCivil, rol, estado);
         } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        limpiarCampos();
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnInhabilitar.setEnabled(false);
    }//GEN-LAST:event_formMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR GUARDIAN?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            int id = Integer.parseInt(txtId.getText());
            GuardianService gs = new GuardianService();
            gs.eliminarGuardian(id);
            limpiarCampos();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Guardian para su eliminacion");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al analizar los datos");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInhabilitarActionPerformed
        try {
            
            int id = Integer.parseInt(txtId.getText());
            GuardianService gs = new GuardianService();
            gs.inhabilitarGuardian(id);
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Guardian para su eliminacion");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al analizar los datos");
        }
    }//GEN-LAST:event_btnInhabilitarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbActivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInhabilitar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JTextField txtApelldo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos(){
    txtApelldo.setText("");
    txtDireccion.setText("");
    txtDni.setText("");
    txtId.setText("");
    txtNombre.setText("");
    txtTelefono.setText("");
    cbxEstadoCivil.setSelectedIndex(0);
    cbxRol.setSelectedIndex(0);
    DateChooser.setDate(null);
    
}
}

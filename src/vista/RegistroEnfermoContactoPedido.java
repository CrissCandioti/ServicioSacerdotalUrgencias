/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import javax.swing.JOptionPane;
import service.ContactoService;
import service.EnfermoService;
import service.GuardiaService;
import service.PedidoService;

/**
 *
 * @author Cristian
 */
public class RegistroEnfermoContactoPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroEnfermoContactoPedido
     */
    public RegistroEnfermoContactoPedido() {
        initComponents();
       lblFecha.setText(LocalDate.now().toString() );
        setLocation(190, 40);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEnfermo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        txtEdadE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtSanatorio = new javax.swing.JTextField();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmbEconciencia = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        PanelContacto = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtParentesco = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEnfermo.setBorder(javax.swing.BorderFactory.createTitledBorder("Enfermo"));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Apellido:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Estado Civil:");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("Estado Conciencia:");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Domicilio:");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setText("Sanatorio:");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel9.setText("Descripcion:");

        txtApellidoE.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtEdadE.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtNombreE.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtDomicilio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtSanatorio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        cmbEstadoCivil.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Soltero", "Casado", "Viudo", "Separado" }));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setText("--");
        jScrollPane1.setViewportView(txtDescripcion);

        cmbEconciencia.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmbEconciencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Consciente", "Inaconciente" }));
        cmbEconciencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEconcienciaActionPerformed(evt);
            }
        });

        jTextField7.setText("id");

        javax.swing.GroupLayout panelEnfermoLayout = new javax.swing.GroupLayout(panelEnfermo);
        panelEnfermo.setLayout(panelEnfermoLayout);
        panelEnfermoLayout.setHorizontalGroup(
            panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEconciencia, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSanatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panelEnfermoLayout.setVerticalGroup(
            panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermoLayout.createSequentialGroup()
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEstadoCivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSanatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(cmbEconciencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );

        getContentPane().add(panelEnfermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 1058, 300));

        PanelContacto.setBorder(javax.swing.BorderFactory.createTitledBorder("Contacto"));

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel10.setText("Apellido:");

        txtApellidoC.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel11.setText("Nombre:");

        txtNombreC.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel12.setText("Parentesco:");

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel13.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtParentesco.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jTextField12.setText("id");

        javax.swing.GroupLayout PanelContactoLayout = new javax.swing.GroupLayout(PanelContacto);
        PanelContacto.setLayout(PanelContactoLayout);
        PanelContactoLayout.setHorizontalGroup(
            PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelContactoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParentesco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(PanelContactoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelContactoLayout.createSequentialGroup()
                                .addComponent(txtApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PanelContactoLayout.setVerticalGroup(
            PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelContactoLayout.createSequentialGroup()
                        .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelContactoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelContactoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel13)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(PanelContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        lblFecha.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1212, 14, 235, 33));

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel14.setText("PEDIDO : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButton2.setText("GUARDAR PEDIDO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEconcienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEconcienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEconcienciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        EnfermoService es = new EnfermoService();
        ContactoService cs = new ContactoService();
        PedidoService ps = new PedidoService();
        GuardiaService gs= new GuardiaService();
        
        //vamos a crear un contacto primero.
        String apellido = txtApellidoC.getText();
        String nombre = txtNombreC.getText();
        String telefono = txtTelefono.getText();
        String parentesco = txtParentesco.getText();
        cs.crearContacto(apellido, nombre, telefono, parentesco);
        JOptionPane.showMessageDialog(this, "Contacto Guardado");
        
        //vamos a crear un enfermo.
        String apellidoe = txtApellidoE.getText();
        String nombree = txtNombreE.getText();
        int edad = Integer.parseInt(txtEdadE.getText());
        String estadoCivil =cmbEstadoCivil.getSelectedItem().toString();
        String estadoConciencia = cmbEconciencia.getSelectedItem().toString();
        String domicilio = txtDomicilio.getText();
        String sanatorio = txtSanatorio.getText();
        String descripcion = txtDescripcion.getText();
        int idContacto = cs.buscarContactoPorNombreYapellido(apellido, nombre).getIdContacto();
        
        es.crearEnfermo(apellidoe, nombree, edad, estadoCivil, estadoConciencia, domicilio, sanatorio, descripcion, idContacto);
        try{
        //por ultimo creamos el pedido
        LocalDate fecha = LocalDate.parse(lblFecha.getText());
        int idGuardia = gs.buscarGuardiaPorfecha(fecha).getIdGuardia();
        int idEnfermo = es.buscarEnfermoPorNombreApellido(apellidoe, nombree).getIdEnfermo();
        
        ps.crearPedido(fecha, idGuardia, idEnfermo);
        
        JOptionPane.showMessageDialog(this, "Pedido Guardado!!");
        }catch(Exception e){
            System.out.println(e);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContacto;
    private javax.swing.JComboBox<String> cmbEconciencia;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JPanel panelEnfermo;
    private javax.swing.JTextField txtApellidoC;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdadE;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtSanatorio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

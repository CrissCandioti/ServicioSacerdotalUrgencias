/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
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
        lblFecha.setText(LocalDate.now().toString());
        setLocation(190, 40);
        txtIdCont.setVisible(false);
        txtIdEnf.setVisible(false);
        txtIdPedido.setVisible(false);

        btnModificar.setEnabled(false);

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
        txtIdEnf = new javax.swing.JTextField();
        PanelContacto = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtParentesco = new javax.swing.JTextField();
        txtIdCont = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtIdPedido = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
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
        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Soltero", "Casado", "Viudo", "Separado", "Sin Informar" }));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setText("--");
        jScrollPane1.setViewportView(txtDescripcion);

        cmbEconciencia.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmbEconciencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Consciente", "Insconciente", "Sin Informar" }));
        cmbEconciencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEconcienciaActionPerformed(evt);
            }
        });

        txtIdEnf.setText("id");

        javax.swing.GroupLayout panelEnfermoLayout = new javax.swing.GroupLayout(panelEnfermo);
        panelEnfermo.setLayout(panelEnfermoLayout);
        panelEnfermoLayout.setHorizontalGroup(
            panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSanatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEconciencia, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(panelEnfermoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtIdEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
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
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSanatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(cmbEconciencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnfermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnfermoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(271, 271, 271))
        );

        getContentPane().add(panelEnfermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 1058, 250));

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

        txtIdCont.setText("id");

        javax.swing.GroupLayout PanelContactoLayout = new javax.swing.GroupLayout(PanelContacto);
        PanelContacto.setLayout(PanelContactoLayout);
        PanelContactoLayout.setHorizontalGroup(
            PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContactoLayout.createSequentialGroup()
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
                                .addComponent(txtApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtIdCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PanelContactoLayout.setVerticalGroup(
            PanelContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContactoLayout.createSequentialGroup()
                .addComponent(txtIdCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
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

        getContentPane().add(PanelContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lblFecha.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1212, 14, 235, 33));

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel14.setText("PEDIDO : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        btnGuardar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnGuardar.setText("GUARDAR PEDIDO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        jButton3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, -1, -1));

        btnModificar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 180, -1));
        getContentPane().add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEconcienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEconcienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEconcienciaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        EnfermoService es = new EnfermoService();
        ContactoService cs = new ContactoService();
        PedidoService ps = new PedidoService();
        GuardiaService gs = new GuardiaService();

        try {
            //vamos a crear un contacto primero.
            String apellido = txtApellidoC.getText();
            String nombre = txtNombreC.getText();
            String telefono = txtTelefono.getText();
            String parentesco = txtParentesco.getText();
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
                return;
            }
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
                return;
            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del telefono no puede estar vacia");
                return;
            }
            if (parentesco.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del parentesco no puede estar vacia");
                return;
            }
            cs.crearContacto(apellido, nombre, telefono, parentesco);
            System.out.println("Contacto creado");

            //vamos a crear un enfermo.
            String apellidoe = txtApellidoE.getText();
            String nombree = txtNombreE.getText();
            int edad = Integer.parseInt(txtEdadE.getText());
            String estadoCivil = cmbEstadoCivil.getSelectedItem().toString();
            String estadoConciencia = cmbEconciencia.getSelectedItem().toString();
            String domicilio = txtDomicilio.getText();
            String sanatorio = txtSanatorio.getText();
            String descripcion = txtDescripcion.getText();
            int idContacto = cs.buscarContactoPorNombreYapellido(apellido, nombre).getIdContacto();

            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
                return;
            }
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
                return;
            }
            if (estadoCivil.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del estado civil no puede estar vacia");
                return;
            }
            if (estadoConciencia.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda sobre el estado de conciencia no puede estar vacia");
                return;
            }
            if (domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del domicilio no puede estar vacia");
                return;
            }
            if (sanatorio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del sanatorio no puede estar vacia");
                return;
            }
            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la descripcion del enfermo");
                return;
            }
            es.crearEnfermo(apellidoe, nombree, edad, estadoCivil, estadoConciencia, domicilio, sanatorio, descripcion, idContacto);

            //por ultimo creamos el pedido
            LocalDate fecha = LocalDate.parse(lblFecha.getText());
            int idGuardia = gs.buscarGuardiaPorfecha(fecha).getIdGuardia();
            int idEnfermo = es.buscarEnfermoPorNombreApellido(apellidoe, nombree).getIdEnfermo();

            ps.crearPedido(fecha, idGuardia, idEnfermo);

            JOptionPane.showMessageDialog(this, "Pedido Guardado!!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        EnfermoService es = new EnfermoService();
        ContactoService cs = new ContactoService();
        PedidoService ps = new PedidoService();
        
        int idPedido = Integer.parseInt(txtIdPedido.getText());
        int idEnfermo = Integer.parseInt(txtIdEnf.getText());
        int idContacto = Integer.parseInt(txtIdCont.getText());
        
        //Modificamos el enfermo
        String apellidoe = txtApellidoE.getText();
        String nombree = txtNombreE.getText();
        int edad = Integer.parseInt(txtEdadE.getText());
        String estadoCivil = cmbEstadoCivil.getSelectedItem().toString();
        String estadoConciencia = cmbEconciencia.getSelectedItem().toString();
        String domicilio = txtDomicilio.getText();
        String sanatorio = txtSanatorio.getText();
        String descripcion = txtDescripcion.getText();

        if (apellidoe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
            return;
        }
        if (nombree.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
            return;
        }
        if (estadoCivil.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda del estado civil no puede estar vacia");
            return;
        }
        if (estadoConciencia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda sobre el estado de conciencia no puede estar vacia");
            return;
        }
        if (domicilio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda del domicilio no puede estar vacia");
            return;
        }
        if (sanatorio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda del sanatorio no puede estar vacia");
            return;
        }
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la descripcion del enfermo");
            return;
        }
        es.modificarEnfermo(idEnfermo, apellidoe, nombree, edad, estadoCivil, estadoConciencia, domicilio, sanatorio, descripcion, idContacto);
        
        //modificamos el Contacto
        String apellido = txtApellidoC.getText();
            String nombre = txtNombreC.getText();
            String telefono = txtTelefono.getText();
            String parentesco = txtParentesco.getText();
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
                return;
            }
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
                return;
            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del telefono no puede estar vacia");
                return;
            }
            if (parentesco.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del parentesco no puede estar vacia");
                return;
            }
            cs.modificarContacto(idContacto, apellido, nombre, telefono, parentesco);
            
        //modificamos el pedido
         LocalDate fecha = LocalDate.parse(lblFecha.getText());
            int idGuardia = ps.buscarPedidoPorID(idPedido).getIdGuardia().getIdGuardia();
            
            ps.modificarPedido(idPedido, fecha, idGuardia, idEnfermo);
            JOptionPane.showMessageDialog(rootPane, "Pedido Modificado");
            this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContacto;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JComboBox<String> cmbEconciencia;
    public static javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel lblFecha;
    private javax.swing.JPanel panelEnfermo;
    public static javax.swing.JTextField txtApellidoC;
    public static javax.swing.JTextField txtApellidoE;
    public static javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtDomicilio;
    public static javax.swing.JTextField txtEdadE;
    public static javax.swing.JTextField txtIdCont;
    public static javax.swing.JTextField txtIdEnf;
    public static javax.swing.JTextField txtIdPedido;
    public static javax.swing.JTextField txtNombreC;
    public static javax.swing.JTextField txtNombreE;
    public static javax.swing.JTextField txtParentesco;
    public static javax.swing.JTextField txtSanatorio;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

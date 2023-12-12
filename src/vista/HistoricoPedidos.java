/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import com.raven.datechooser.DateBetween;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.listener.DateChooserAction;
import com.raven.datechooser.listener.DateChooserAdapter;
import com.toedter.calendar.JTextFieldDateEditor;
import entidades.Pedido;
import entidades.Sacerdote;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.security.sasl.Sasl;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import utilidades.TableActionCellEditor;
import utilidades.TableActionCellRenderer;
import utilidades.TableActionEvent;
import service.EnfermoService;
import service.GuardianService;
import service.PedidoService;
import service.SacerdoteService;
import static vista.Principal.escritorio;

public class HistoricoPedidos extends javax.swing.JInternalFrame {

    private DateChooser chdate = new DateChooser();

    public HistoricoPedidos() {
        initComponents();

    

        chdate.setTextField(text);
        chdate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        chdate.setLabelCurrentDayVisible(false);

//        System.out.println(chdate.getSelectedDateBetween().getFromDate());
//        System.out.println(chdate.getSelectedDateBetween().getToDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCantidadPedidos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistoricos = new javax.swing.JTable();
        rbEnfermos = new javax.swing.JRadioButton();
        rbSacerdotes = new javax.swing.JRadioButton();
        rbGuardianes = new javax.swing.JRadioButton();
        text = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Histórico de Pedidos");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("*Ingrese las fechas entre las que desee buscar.");

        lblCantidadPedidos.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblCantidadPedidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Pedidos");

        tablaHistoricos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHistoricos.setRowHeight(42);
        jScrollPane1.setViewportView(tablaHistoricos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 529, Short.MAX_VALUE)
                .addComponent(lblCantidadPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCantidadPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        buttonGroup1.add(rbEnfermos);
        rbEnfermos.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbEnfermos.setText("Buscar Enfermos");
        rbEnfermos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbEnfermosMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbSacerdotes);
        rbSacerdotes.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbSacerdotes.setText("Buscar Sacerdotes");
        rbSacerdotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSacerdotesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbGuardianes);
        rbGuardianes.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbGuardianes.setText("Buscar Guardianes");
        rbGuardianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGuardianesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(320, 320, 320))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(rbEnfermos)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbSacerdotes)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbGuardianes)))
                                        .addGap(170, 170, 170))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEnfermos)
                    .addComponent(rbSacerdotes)
                    .addComponent(rbGuardianes))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbEnfermosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEnfermosMouseClicked
        if (text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar las fechas.");
            return;
        } else {
        llenarTablaEnfermos();

        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                modificarEnfermos();
            }

            @Override
            public void onView(int row) {
                verEnfermo();
            }

            @Override
            public void onDelete(int row) {

            }

        };
        tablaHistoricos.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRenderer());
        tablaHistoricos.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        }
    }//GEN-LAST:event_rbEnfermosMouseClicked

    private void rbSacerdotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSacerdotesActionPerformed
        if (text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar las fechas.");
            return;
        } else {
        llenarTablaSacerdotes();
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                modificarSacerdote();
            }

            @Override
            public void onView(int row) {
                verSacerdotes();
            }

            @Override
            public void onDelete(int row) {

            }
        };
        tablaHistoricos.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRenderer());
        tablaHistoricos.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        }
    }//GEN-LAST:event_rbSacerdotesActionPerformed

    private void rbGuardianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGuardianesActionPerformed
        if (text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar las fechas.");
            return;
        } else {
            llenarTablaGuardianes();
          
        }
    }//GEN-LAST:event_rbGuardianesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCantidadPedidos;
    private javax.swing.JRadioButton rbEnfermos;
    private javax.swing.JRadioButton rbGuardianes;
    private javax.swing.JRadioButton rbSacerdotes;
    private javax.swing.JTable tablaHistoricos;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaEnfermos() {

        try {
            GuardianService gs = new GuardianService();
            PedidoService pd = new PedidoService();

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String fecha1 = df.format(chdate.getSelectedDateBetween().getFromDate());
            String fecha2 = df.format(chdate.getSelectedDateBetween().getToDate());

            ArrayList guardian = pd.obtenerPedidoEntreDosFechas(LocalDate.parse(fecha1), LocalDate.parse(fecha2));

            lblCantidadPedidos.setText("" + guardian.size());
            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Pedido N°");
            modelo.addColumn("Fecha");
            modelo.addColumn("Nombre ");
            modelo.addColumn("apellido ");
            modelo.addColumn("ver o modificar");

            tablaHistoricos.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object pedido[] = null;

            for (int i = 0; i < guardian.size(); i++) {
                modelo.addRow(pedido);
                Pedido getG = (Pedido) guardian.get(i);

                modelo.setValueAt(getG.getIdPedido(), i, 0);
                modelo.setValueAt(getG.getFechaPedido().toString(), i, 1);
                modelo.setValueAt(getG.getIdEnfermo().getNombre(), i, 2);
                modelo.setValueAt(getG.getIdEnfermo().getApellido(), i, 3);

            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de Guardianes en la base de datos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    public void ControlaInstancia(JInternalFrame inter) {

        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame.getClass().equals(inter.getClass())) {
                frame.toFront(); // Si está abierto, tráelo al frente
                return;
            }
        }

        // Si no está abierto, crea una nueva instancia 
        escritorio.add(inter);
        inter.setVisible(true);
        inter.setLocation(190, 10);
    }

    private void llenarTablaSacerdotes() {
        try {
            GuardianService gs = new GuardianService();
            PedidoService pd = new PedidoService();

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String fecha1 = df.format(chdate.getSelectedDateBetween().getFromDate());
            String fecha2 = df.format(chdate.getSelectedDateBetween().getToDate());

            ArrayList guardian = pd.obtenerPedidoEntreDosFechas(LocalDate.parse(fecha1), LocalDate.parse(fecha2));
            lblCantidadPedidos.setText("" + guardian.size());
            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Pedido N°");
            modelo.addColumn("Fecha");
            modelo.addColumn("Sacerdote");
            modelo.addColumn("DNI");
            modelo.addColumn("ver o modificar");

            tablaHistoricos.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object pedido[] = null;

            for (int i = 0; i < guardian.size(); i++) {
                modelo.addRow(pedido);
                Pedido getG = (Pedido) guardian.get(i);

                modelo.setValueAt(getG.getIdPedido(), i, 0);
                modelo.setValueAt(getG.getFechaPedido().toString(), i, 1);
                modelo.setValueAt(getG.getIdGuardia().getIdSacerdote().getNombre() + ", " + getG.getIdGuardia().getIdSacerdote().getApellido(), i, 2);
                modelo.setValueAt(getG.getIdGuardia().getIdSacerdote().getDni(), i, 3);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de Guardianes en la base de datos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
        }

    }

    private void llenarTablaGuardianes() {
        try {
            GuardianService gs = new GuardianService();
            PedidoService pd = new PedidoService();

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String fecha1 =df.format( chdate.getSelectedDateBetween().getFromDate());
            String fecha2 = df.format(chdate.getSelectedDateBetween().getToDate());

            ArrayList guardian = pd.obtenerPedidoEntreDosFechas(LocalDate.parse(fecha1), LocalDate.parse(fecha2));
            lblCantidadPedidos.setText("" + guardian.size());
            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Pedido N°");
            modelo.addColumn("Fecha");
            modelo.addColumn("Vocal");
            modelo.addColumn("Telefonista");
            modelo.addColumn("Chofer");
            modelo.addColumn("Acompañante");
         
            tablaHistoricos.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object pedido[] = null;

            for (int i = 0; i < guardian.size(); i++) {
                modelo.addRow(pedido);
                Pedido getG = (Pedido) guardian.get(i);

                modelo.setValueAt(getG.getIdPedido(), i, 0);
                modelo.setValueAt(getG.getFechaPedido().toString(), i, 1);
                modelo.setValueAt(getG.getIdGuardia().getIdVocal().getNombre() + ", " + getG.getIdGuardia().getIdVocal().getApellido(), i, 2);
                modelo.setValueAt(getG.getIdGuardia().getIdTelefonista().getNombre() + ", " + getG.getIdGuardia().getIdTelefonista().getApellido(), i, 3);
                modelo.setValueAt(getG.getIdGuardia().getIdChofer().getNombre() + "," + getG.getIdGuardia().getIdChofer().getApellido(), i, 4);
                modelo.setValueAt(getG.getIdGuardia().getIdAcompañante().getNombre() + ", " + getG.getIdGuardia().getIdAcompañante().getApellido(), i, 5);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de Guardianes en la base de datos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    public void verSacerdotes() {

        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaHistoricos.getModel();

            String dni = modelo.getValueAt(tablaHistoricos.getSelectedRow(), 3).toString();

            SacerdoteService ss = new SacerdoteService();
            String mensaje = ss.buscarSacerdotePorDNI(dni).toString();

            JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verEnfermo() {
        DefaultTableModel modelo = (DefaultTableModel) tablaHistoricos.getModel();
        String nombre = modelo.getValueAt(tablaHistoricos.getSelectedRow(), 2).toString();
        String apellido = modelo.getValueAt(tablaHistoricos.getSelectedRow(), 3).toString();

        EnfermoService es = new EnfermoService();
        String mensaje = es.buscarEnfermoPorNombreApellido(apellido, nombre).toString();

        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modificarEnfermos() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaHistoricos.getModel();
            int id = (int) modelo.getValueAt(tablaHistoricos.getSelectedRow(), 0);

            PedidoService pe = new PedidoService();
            Pedido e = pe.buscarPedidoPorID(id);

            RegistroEnfermoContactoPedido p = new RegistroEnfermoContactoPedido();
            ControlaInstancia(p);
            p.txtApellidoE.setText(e.getIdEnfermo().getApellido());
            p.txtNombreE.setText(e.getIdEnfermo().getNombre());
            p.txtEdadE.setText("" + e.getIdEnfermo().getEdad());
            p.txtDomicilio.setText(e.getIdEnfermo().getDomicilio());
            p.txtSanatorio.setText(e.getIdEnfermo().getSanatorio());
            p.txtDescripcion.setText(e.getIdEnfermo().getDescripcion());
            p.txtApellidoC.setText(e.getIdEnfermo().getIdContacto().getApellido());
            p.txtNombreC.setText(e.getIdEnfermo().getIdContacto().getNombre());
            p.txtParentesco.setText(e.getIdEnfermo().getIdContacto().getParentesco());
            p.txtTelefono.setText(e.getIdEnfermo().getIdContacto().getTelefono());
            p.cmbEconciencia.setSelectedItem(e.getIdEnfermo().getEstadoConciencia());
            p.cmbEstadoCivil.setSelectedItem(e.getIdEnfermo().getEstadoCivil());
            p.txtIdEnf.setText("" + e.getIdEnfermo().getIdEnfermo());
            p.txtIdCont.setText("" + e.getIdEnfermo().getIdContacto().getIdContacto());
            p.txtIdPedido.setText("" + e.getIdPedido());

            RegistroEnfermoContactoPedido.btnGuardar.setEnabled(false);
            p.btnModificar.setEnabled(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modificarSacerdote() {
        DefaultTableModel modelo = (DefaultTableModel) tablaHistoricos.getModel();
        String dni = modelo.getValueAt(tablaHistoricos.getSelectedRow(), 3).toString();

        SacerdoteService ss = new SacerdoteService();
        Sacerdote s = ss.buscarSacerdotePorDNI(dni);

        RegistroSacerdotes rs = new RegistroSacerdotes();
        ControlaInstancia(rs);

        RegistroSacerdotes.txtId.setText("" + s.getIdSacerdote());
        RegistroSacerdotes.txtApellido.setText(s.getApellido());
        RegistroSacerdotes.txtDni.setText(s.getDni());
        RegistroSacerdotes.txtNombre.setText(s.getNombre());
        RegistroSacerdotes.txtTelefono.setText(s.getTelefono());

        LocalDate fecha = s.getFechaNacimiento();
        java.util.Date utilDate = java.util.Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
        RegistroSacerdotes.datechooser.setDate(utilDate);

        RegistroSacerdotes.rbActivo.setSelected(s.isEstado());
        RegistroSacerdotes.btnGuardar.setEnabled(false);
        RegistroSacerdotes.btnInhabilitar.setEnabled(true);
        RegistroSacerdotes.btnModificar.setEnabled(true);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package raven.cell;

import entidades.Pedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.EnfermoService;
import service.PedidoService;
import static vista.Principal.escritorio;
import vista.RegistroEnfermoContactoPedido;

/**
 *
 * @author Cristian
 */
public class PanelAction extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction
     */
    public PanelAction() {
        initComponents();
    }

    public void initEvent(TableActionEvent event, int row) {

        //metodo que se ejecuta cuando hago click en edit(imagen del lápiz)
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent es) {
                modificar();
            }
        });
        //método que se ejecuta cuando hago click en view(imagen del ojo)
        cmdView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ver();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdEdit = new raven.cell.ActionButton();
        cmdView = new raven.cell.ActionButton();

        setBackground(new java.awt.Color(255, 255, 255));

        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/cell/editar(icono).png"))); // NOI18N

        cmdView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/cell/ver(icono).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.cell.ActionButton cmdEdit;
    private raven.cell.ActionButton cmdView;
    // End of variables declaration//GEN-END:variables

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

    public void modificar() {
        DefaultTableModel modelo = (DefaultTableModel) vista.PedidosDelDia.tablaPedidos.getModel();
        int id = (int) modelo.getValueAt(vista.PedidosDelDia.tablaPedidos.getSelectedRow(), 0);

        PedidoService pe = new PedidoService();
        Pedido e = pe.buscarPedidoPorID(id);

        RegistroEnfermoContactoPedido p = new RegistroEnfermoContactoPedido();
        ControlaInstancia(p);
        RegistroEnfermoContactoPedido.txtApellidoE.setText(e.getIdEnfermo().getApellido());
        RegistroEnfermoContactoPedido.txtNombreE.setText(e.getIdEnfermo().getNombre());
        RegistroEnfermoContactoPedido.txtEdadE.setText("" + e.getIdEnfermo().getEdad());
        RegistroEnfermoContactoPedido.txtDomicilio.setText(e.getIdEnfermo().getDomicilio());
        RegistroEnfermoContactoPedido.txtSanatorio.setText(e.getIdEnfermo().getSanatorio());
        RegistroEnfermoContactoPedido.txtDescripcion.setText(e.getIdEnfermo().getDescripcion());
        RegistroEnfermoContactoPedido.txtApellidoC.setText(e.getIdEnfermo().getIdContacto().getApellido());
        RegistroEnfermoContactoPedido.txtNombreC.setText(e.getIdEnfermo().getIdContacto().getNombre());
        RegistroEnfermoContactoPedido.txtParentesco.setText(e.getIdEnfermo().getIdContacto().getParentesco());
        RegistroEnfermoContactoPedido.txtTelefono.setText(e.getIdEnfermo().getIdContacto().getTelefono());
        RegistroEnfermoContactoPedido.cmbEconciencia.setSelectedItem(e.getIdEnfermo().getEstadoConciencia());
        RegistroEnfermoContactoPedido.cmbEstadoCivil.setSelectedItem(e.getIdEnfermo().getEstadoCivil());
        RegistroEnfermoContactoPedido.txtIdEnf.setText("" + e.getIdEnfermo().getIdEnfermo());
        RegistroEnfermoContactoPedido.txtIdCont.setText("" + e.getIdEnfermo().getIdContacto().getIdContacto());
        RegistroEnfermoContactoPedido.txtIdPedido.setText("" + e.getIdPedido());

        RegistroEnfermoContactoPedido.btnGuardar.setEnabled(false);
        RegistroEnfermoContactoPedido.btnModificar.setEnabled(true);

    }
    
    public void ver(){
         DefaultTableModel modelo = (DefaultTableModel) vista.PedidosDelDia.tablaPedidos.getModel();
        String nombre =  modelo.getValueAt(vista.PedidosDelDia.tablaPedidos.getSelectedRow(), 1).toString();
        String apellido =  modelo.getValueAt(vista.PedidosDelDia.tablaPedidos.getSelectedRow(), 2).toString();
        
        EnfermoService es = new EnfermoService();
        String mensaje = es.buscarEnfermoPorNombreApellido(apellido, nombre).toString();
        
       JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}
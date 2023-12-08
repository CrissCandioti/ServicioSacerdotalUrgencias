/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import accesoDatos.GuardiaDAO;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import service.SacerdoteService;

/**
 *
 * @author Cristian
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
//        escritorio.setBorder(new ImagenFondo());
//        this.setExtendedState(Principal.NORMAL);

        GuardiaDAO gd = new GuardiaDAO();
        if (gd.mostrarEstado().getEstado().equals("cerrado")) {

            Guardia g = new Guardia();
            ControlaInstancia(g);
        } else {
            String fecha = gd.mostrarEstado().getFecha().toString();

            JOptionPane.showMessageDialog(jMenu1, "la Guardia " + fecha + "  ya esta Abierta!");

        }
        if (gd.mostrarEstado().getEstado().equals("cerrado")) {
            jMenuAdmin.setEnabled(false);
            jMenuLlamados.setEnabled(false);
            jMenuConsultas.setEnabled(false);
            jMenu2.setEnabled(false);

        }
        
//          SacerdoteService ss = new SacerdoteService();
//        ArrayList guardia = ss.guardiaPorSacerdotes(5);
//        for (Object object : guardia) {
//            System.out.println(object);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jSeparator2 = new javax.swing.JSeparator();
        btnPedido = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdmin = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuGuardianes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSacerdotes = new javax.swing.JMenuItem();
        jMenuLlamados = new javax.swing.JMenu();
        jMenuPedidos = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        menuListadoSacerdotes = new javax.swing.JMenuItem();
        menuListadoGuardianes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1200,700);

        escritorio.setPreferredSize(new java.awt.Dimension(1300, 700));
        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escritorioMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnPedido.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnPedido.setText("NUEVO PEDIDO");
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        escritorio.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnPedido, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1108, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuAdmin.setText("Administracion");

        jMenu1.setText("Registros");

        jMenuGuardianes.setText("Guardianes");
        jMenuGuardianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardianesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuGuardianes);

        jMenuItem1.setText("Enfermos");
        jMenu1.add(jMenuItem1);

        jMenuSacerdotes.setText("Sacerdotes");
        jMenuSacerdotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSacerdotesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSacerdotes);

        jMenuAdmin.add(jMenu1);

        jMenuBar1.add(jMenuAdmin);

        jMenuLlamados.setText("Llamados");

        jMenuPedidos.setText("Pedidos");
        jMenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPedidosActionPerformed(evt);
            }
        });
        jMenuLlamados.add(jMenuPedidos);

        jMenuBar1.add(jMenuLlamados);

        jMenuConsultas.setText("Consultas");

        menuListadoSacerdotes.setText("Listado total de Sacerdotes");
        menuListadoSacerdotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListadoSacerdotesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(menuListadoSacerdotes);

        menuListadoGuardianes.setText("Listado total de Guardianes");
        menuListadoGuardianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListadoGuardianesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(menuListadoGuardianes);

        jMenuItem4.setText("Pedidos del dia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem4);

        jMenuItem5.setText("Historico de Pedidos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem5);

        jMenuBar1.add(jMenuConsultas);

        jMenu2.setText("Cerrar Guardia");

        jMenuItem3.setText("Cerrar Guardia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuGuardianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardianesActionPerformed

        cerrarFrames();
        RegistroGuardianes r = new RegistroGuardianes();
        ControlaInstancia(r);
    }//GEN-LAST:event_jMenuGuardianesActionPerformed

    private void jMenuSacerdotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSacerdotesActionPerformed
        cerrarFrames();
        RegistroSacerdotes s = new RegistroSacerdotes();
        ControlaInstancia(s);
    }//GEN-LAST:event_jMenuSacerdotesActionPerformed

    private void menuListadoSacerdotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoSacerdotesActionPerformed
        cerrarFrames();
        ConsultaSacerdotes consulta = new ConsultaSacerdotes();
        ControlaInstancia(consulta);
    }//GEN-LAST:event_menuListadoSacerdotesActionPerformed

    private void menuListadoGuardianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoGuardianesActionPerformed
        cerrarFrames();
        ConsultaGuardianes cs = new ConsultaGuardianes();
        ControlaInstancia(cs);


    }//GEN-LAST:event_menuListadoGuardianesActionPerformed

    private void escritorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseClicked

    }//GEN-LAST:event_escritorioMouseClicked

    private void jMenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPedidosActionPerformed
        cerrarFrames();
        RegistroEnfermoContactoPedido registro = new RegistroEnfermoContactoPedido();
        ControlaInstancia(registro);
    }//GEN-LAST:event_jMenuPedidosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        cerrarFrames();
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmar Cierre",
                JOptionPane.YES_NO_OPTION
        );
        GuardiaDAO gd = new GuardiaDAO();

        int id = gd.mostrarEstado().getIdGuardia();
        gd.modificarEstado(id);
        JOptionPane.showMessageDialog(jMenu1, "Guardia cerrada");

        if (confirm == JOptionPane.YES_OPTION) {

            System.exit(0);
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        cerrarFrames();
        PedidosDelDia pd = new PedidosDelDia();
        ControlaInstancia(pd);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        cerrarFrames();
        RegistroEnfermoContactoPedido registro = new RegistroEnfermoContactoPedido();
        ControlaInstancia(registro);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       cerrarFrames();
        HistoricoPedidos hp = new HistoricoPedidos();
        ControlaInstancia(hp);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedido;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuGuardianes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JMenu jMenuLlamados;
    private javax.swing.JMenuItem jMenuPedidos;
    private javax.swing.JMenuItem jMenuSacerdotes;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JMenuItem menuListadoGuardianes;
    private javax.swing.JMenuItem menuListadoSacerdotes;
    // End of variables declaration//GEN-END:variables

    // metodo para controlar que el internalFrame no se instancie dos veces y que cuando se lo precise traerlo al frente.
    public final void ControlaInstancia(JInternalFrame inter) {
        cerrarFrames();
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

    void cerrarFrames() {
        for (JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

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
        escritorio = new javax.swing.JDesktopPane();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuGuardia = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuGuardianes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSacerdotes = new javax.swing.JMenuItem();
        jMenuLlamados = new javax.swing.JMenu();
        jMenuPedidos = new javax.swing.JMenuItem();
        jMenuEnfermos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        escritorio.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(981, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jMenuAdmin.setText("Administracion");

        jMenuGuardia.setText("Guardia");
        jMenuGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardiaActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuGuardia);

        jMenu1.setText("Registros");

        jMenuGuardianes.setText("Guardianes");
        jMenu1.add(jMenuGuardianes);

        jMenuItem1.setText("Enfermos");
        jMenu1.add(jMenuItem1);

        jMenuSacerdotes.setText("Sacerdotes");
        jMenu1.add(jMenuSacerdotes);

        jMenuAdmin.add(jMenu1);

        jMenuBar1.add(jMenuAdmin);

        jMenuLlamados.setText("Llamados");

        jMenuPedidos.setText("Pedidos");
        jMenuLlamados.add(jMenuPedidos);

        jMenuEnfermos.setText("Enfermos");
        jMenuLlamados.add(jMenuEnfermos);

        jMenuBar1.add(jMenuLlamados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardiaActionPerformed
        Guardia g = new Guardia();
        escritorio.add(g);
        g.show();
                    
    }//GEN-LAST:event_jMenuGuardiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEnfermos;
    private javax.swing.JMenuItem jMenuGuardia;
    private javax.swing.JMenuItem jMenuGuardianes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuLlamados;
    private javax.swing.JMenuItem jMenuPedidos;
    private javax.swing.JMenuItem jMenuSacerdotes;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.Guardian;
import entidades.Sacerdote;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import service.GuardiaService;
import service.GuardianService;
import service.SacerdoteService;

/**
 *
 * @author Cristian
 */
public class Guardia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Guardia
     */
    public Guardia() {
        initComponents();
        setFecha();
        this.setLocation(190,40);
        llenarComboBoxGuardian();
        llenarComboSacerdote();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbSacerdote = new javax.swing.JComboBox<>();
        cmbChofer = new javax.swing.JComboBox<>();
        cmbTelefonista = new javax.swing.JComboBox<>();
        cmbAcompañante = new javax.swing.JComboBox<>();
        cmbVocal = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setTitle("Guardia");
        setPreferredSize(new java.awt.Dimension(842, 555));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Registro Guardia diaria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 12, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 696, 10));

        lblFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 144, 32));

        jLabel2.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel2.setText("Fecha :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 66, 32));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("GUARDIA N° :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 132, 37));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Chofer :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 258, 37));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sacerdote :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 258, 37));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Vocal de Turno :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 380, 536, 37));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefonista :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 330, 460, 37));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Acompañante :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 258, 37));

        cmbSacerdote.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jPanel1.add(cmbSacerdote, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 389, 37));

        cmbChofer.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        cmbChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChoferActionPerformed(evt);
            }
        });
        jPanel1.add(cmbChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 389, 37));

        cmbTelefonista.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jPanel1.add(cmbTelefonista, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 389, 37));

        cmbAcompañante.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jPanel1.add(cmbAcompañante, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 389, 37));

        cmbVocal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jPanel1.add(cmbVocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 389, 37));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton1.setText("Guardar Guardia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 469, 258, 54));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 380, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChoferActionPerformed
      
    }//GEN-LAST:event_cmbChoferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GuardiaService gs = new GuardiaService();
        
        String fecha = lblFecha.getText();
        int idVocal = cmbVocal.getItemAt(cmbVocal.getSelectedIndex()).getIdGuardian();
        int idTelefonista = cmbTelefonista.getItemAt(cmbTelefonista.getSelectedIndex()).getIdGuardian();
        int idChofer = cmbChofer.getItemAt(cmbChofer.getSelectedIndex()).getIdGuardian();
        int idAcompañante = cmbAcompañante.getItemAt(cmbAcompañante.getSelectedIndex()).getIdGuardian();
        int idSacerdote = cmbSacerdote.getItemAt(cmbSacerdote.getSelectedIndex()).getIdSacerdote();
        String estado = "abierto";
        gs.crearGuardia(LocalDate.parse(fecha), idVocal, idTelefonista, idChofer, idAcompañante, idSacerdote,estado);
        JOptionPane.showMessageDialog(this, "Guardia Creada!!");
        
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Guardian> cmbAcompañante;
    private javax.swing.JComboBox<Guardian> cmbChofer;
    private javax.swing.JComboBox<Sacerdote> cmbSacerdote;
    private javax.swing.JComboBox<Guardian> cmbTelefonista;
    private javax.swing.JComboBox<Guardian> cmbVocal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    // End of variables declaration//GEN-END:variables

    public void setFecha(){
        lblFecha.setText(LocalDate.now().toString());
        
    }
    
     public void llenarComboBoxGuardian() {
         GuardianService g = new GuardianService();
        
        
        try {
            for (Guardian o : g.listaGuardianes()) {
                cmbChofer.addItem(o);
                cmbAcompañante.addItem(o);
                cmbTelefonista.addItem(o);
                cmbVocal.addItem(o);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No pudimos tener acceso al listado de alumnos");
        }
    }
     
     public void llenarComboSacerdote(){
         SacerdoteService ss = new SacerdoteService();
         
         try {
             for (Sacerdote s : ss.listaSacerdotes()) {
                 cmbSacerdote.addItem(s);
                 
             }
         } catch (Exception e) {
             System.out.println(e);
         }
     }
}

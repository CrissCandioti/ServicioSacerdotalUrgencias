/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.InicioSecion;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Font;
import javax.management.Notification;
import javax.swing.UIManager;
import raven.popup.GlassPanePopup;
import raven.toast.Notifications;
import vista.InicioSecion.Manager.FormsManager;
import vista.InicioSecion.Paneles.LoginPanel;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        //Ubicamos en el centro la ventana
        setLocationRelativeTo(null);
        //Instanciamos el Panel para que sea lo primero que se muestre
        setContentPane(new LoginPanel());
        //Utilizamos nuestro manager 
        FormsManager.getInstance().inicioLogin(this);
        //Para las notificaciones
        Notifications.getInstance().setJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
//Instalamos una dependencia para su uso
        FlatRobotoFont.install();
        /**
         * Con este comando estamos utilizando las distintas propiedades de
         * FlatLaf para modificar la estetica de la ventana, desde el tamaño de
         * sus botones en el borden superior, hasta los colores dentro de la
         * propia venta. Para eso necesitamos crear un "File Propertis", este
         * archivo file debe contener su nombre si o si "FlatLaf.propertis" para
         * que su funcionamiento sea el correcto. Y en package agregamos el
         * paquete donde se ubica este file propertis
         */
        FlatLaf.registerCustomDefaultsSource("vista.InicioSecion.Paneles");
        /**
         * Esta propiedad se utiliza para especificar la fuente predeterminada
         * que se utilizará en la interfaz de usuario de tu aplicación.
         */
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        //Instalamos las opciones de FlatLaf que queremos utilizar en la vista
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

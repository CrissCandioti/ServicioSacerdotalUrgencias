package vista.InicioSecion.Paneles;

import com.formdev.flatlaf.FlatClientProperties;
import entidades.Guardian;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;
import service.GuardianService;
import vista.Principal;

/**
 *
 * @author criss
 */
public class LoginPanel extends JPanel {

    private Image backgroundImage;//Para agregar una imagen al JPanel
    private GuardianService service = new GuardianService();
    private JTextField JTextFieldUsuario;
    private JButton JButtonEntrar;
    private JButton JButtonSalir;

    public LoginPanel() {
        //Agregamos la imagen e instanciamos en el constructor
        backgroundImage = new ImageIcon(getClass().getResource("/vista/InicioSecion/Paneles/IMG.png")).getImage();
        init();
    }
        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
    private void init() {
        try {
            setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
            JTextFieldUsuario = new JTextField();
            JButtonEntrar = new JButton("Entrar");
            JButtonSalir = new JButton("Salir");
            JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 50 70 50 70", "fill,250:280"));
            panel.putClientProperty(FlatClientProperties.STYLE, ""
                    + "arc:20;");
            JTextFieldUsuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su numero de documento");
            JLabel JLabel1 = new JLabel("Bienvenido Guardian");
            JLabel1.putClientProperty(FlatClientProperties.STYLE, "" + "font:bold +10");
            JLabel JLabel2 = new JLabel("Por favor inicie secion para continuar");
            JLabel2.putClientProperty(FlatClientProperties.STYLE, "");
            panel.add(JLabel1);
            panel.add(JLabel2);
            panel.add(new JLabel("Documento"), "gapy 8");
            panel.add(JTextFieldUsuario);
            panel.add(JButtonEntrar, "gapy 10");
            JButtonEntrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Esta es nuestra logica para obtener la informacion de los textField
                    String documento = JTextFieldUsuario.getText().trim();
                    Guardian aux = service.buscarGuardianPorDNI(documento);
                    if (aux == null) {
                        Notifications.getInstance().show(Notifications.Type.ERROR, "El documento no fue encontrado en la base de datos");
                    } else {
                        //Este es el codigo para traer un nuevo jframe y cerrar el anterior
                        //Aqui va la instancia del nuevo jframe que se quiere traer
                        Principal p = new Principal();
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(LoginPanel.this);
                        frame.dispose();
                        p.setVisible(true);
                        p.setLocationRelativeTo(null);
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Bienvenido " + aux.getNombre() + " " + aux.getApellido());
                    }
                }
            });
            panel.add(JButtonSalir);
            JButtonSalir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    System.exit(0);
                }
            });
            panel.add(new JLabel("*Recuerde que los permisos de administrador"));
            panel.add(new JLabel(" varia entre los usuarios"));
            add(panel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.InicioSecion.Manager;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.EventQueue;
import javax.swing.JComponent;
import vista.InicioSecion.main;

/**
 * Esta clase es de suma importancia, porque es la encarga de la transicion de
 * los distintos paneles que queremos que se muestre en nuestro JFrame. Debemos
 * tener en cuenta que cada JFrame nuevo necesita un paquete con su "Manager"
 * para manejar sus respectivos paneles, cada "Manager" se encarga de un solo
 * JFrame.
 */
public class FormsManager {

    //Creamos sus atributos
    private main main;
    private static FormsManager instance; //debe ser estatico para poder utilizar correctamente el get que tambien es estatico

    //Creamos solamente el get del atributo de la misma clase pero estatico.
    public static FormsManager getInstance() {
        //Este condicional esta manejando la logica que si no esta abierta la venta la abra.
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }

    //Creamos su constructor pero en privado
    private FormsManager() {
    }

    //Creamos los metodos necesarios
    public void inicioLogin(main main) {
        this.main = main;
    }

    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            main.setContentPane(form);
            main.revalidate();
            main.repaint();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }
}

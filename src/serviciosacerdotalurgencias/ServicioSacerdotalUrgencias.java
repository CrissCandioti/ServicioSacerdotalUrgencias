/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosacerdotalurgencias;

import service.EnfermoService;
import vista.Principal;

/**
 *
 * @author criss
 */
public class ServicioSacerdotalUrgencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        Principal p = new Principal();
//        p.setVisible(true);
//        p.setLocationRelativeTo(null);
        EnfermoService es = new EnfermoService();
        System.out.println(es.buscarEnfermoPorID(1));
    }

}

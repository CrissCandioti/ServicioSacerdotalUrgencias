/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosacerdotalurgencias;

import java.time.LocalDate;
import service.EnfermoService;
import service.GuardiaService;
import service.PedidoService;
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
        GuardiaService gs = new GuardiaService();
        PedidoService ps = new PedidoService();
        //ps.crearPedido(LocalDate.now(), 1, 0);
        gs.crearGuardia(LocalDate.now(), 4, 4, 4, 4, 1, 0);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosacerdotalurgencias;

import java.time.LocalDate;
import serviciosacerdotalurgencias.Service.GuardianService;
import serviciosacerdotalurgencias.Service.SacerdoteService;

/**
 *
 * @author criss
 */
public class ServicioSacerdotalUrgencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SacerdoteService s = new SacerdoteService();
        GuardianService g = new GuardianService();
        g.modificarGuardian(7, "1234566", "SHOBERTO", "CARLITOX", "LAS HERAS", "3312", LocalDate.now(), "CASADO", "CONDUCTOR", true);
    }

}

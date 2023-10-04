/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.GuardiaDAO;
import entidades.Guardia;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class GuardiaService {
    
    public void crearGuardia(LocalDate fecha, int idVocal, int idTelefonista, int idChofer, int idAcompañante, int idSacerdote, int idPedido) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            PedidoService ps = new PedidoService();
            dao.guardarGuardia(new Guardia(fecha, gs.buscarGuardianPorID(idVocal), gs.buscarGuardianPorID(idTelefonista), gs.buscarGuardianPorID(idChofer), gs.buscarGuardianPorID(idAcompañante), ss.buscarSacerdotePorID(idSacerdote), ps.buscarPedidoPorID(idPedido)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente la guardia");
        }
    }
    
    public Guardia buscarGuardiaPorID(int id) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.buscarGuardiaPorID(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar la Guardia solicitada");
        }
        return null;
    }
}

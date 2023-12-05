/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.GuardiaDAO;
import entidades.Guardia;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class GuardiaService {

    public void crearGuardia(LocalDate fecha, int idVocal, int idTelefonista, int idChofer, int idAcompañante, int idSacerdote, String estado) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            PedidoService ps = new PedidoService();
            dao.guardarGuardia(new Guardia(fecha, gs.buscarGuardianPorID(idVocal), gs.buscarGuardianPorID(idTelefonista), gs.buscarGuardianPorID(idChofer), gs.buscarGuardianPorID(idAcompañante), ss.buscarSacerdotePorID(idSacerdote), estado));
            JOptionPane.showMessageDialog(null, "Se creo correctamente la guardia");
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

    public Guardia buscarGuardiaPorfecha(LocalDate fecha) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.buscarGuardiaPorfecha(fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar la Guardia solicitada");
        }
        return null;
    }

    public ArrayList<Guardia> listarGuardia() {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.listaGuardias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar la lista de las Guardias");
        }
        return null;
    }

    public void modificarGuardia(int id, LocalDate fecha, int idVocal, int idTelefonista, int idChofer, int idAcompañante, int idSacerdote, String estado) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            PedidoService ps = new PedidoService();
            dao.guardarGuardia(new Guardia(idSacerdote, fecha, gs.buscarGuardianPorID(idVocal), gs.buscarGuardianPorID(idTelefonista), gs.buscarGuardianPorID(idChofer), gs.buscarGuardianPorID(idAcompañante), ss.buscarSacerdotePorID(idSacerdote), estado));
            JOptionPane.showMessageDialog(null, "Se creo modifico correctamente la guardia");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente la guardia");
        }
    }

    public ArrayList<Integer> buscarSacerdotePorNombreYApellido(String nombre, String apellido) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.buscarSacerdotePorNombreYApellido(nombre, apellido);
        } catch (Exception e) {
            System.out.println("Error en el metodo buscarSacerdotePorNombreYApellido de la clase SacerdoteService: " + e);
        }
        return null;
    }

    public ArrayList<Integer> guardiasDeLosGuardianes(int id) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.guardiasDeLosGuardianes(id);
        } catch (Exception e) {
            System.out.println("Error en el metodo guardiasDeLosGuardianes() de la clase GuardiaService: " + e);
        }
        return null;
    }

}

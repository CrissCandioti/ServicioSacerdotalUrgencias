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

    public void crearGuardia(LocalDate fecha, int idVocal, int idTelefonista, int idChofer, int idAcompañante, int idSacerdote) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            PedidoService ps = new PedidoService();
            dao.guardarGuardia(new Guardia(fecha, gs.buscarGuardianPorID(idVocal), gs.buscarGuardianPorID(idTelefonista), gs.buscarGuardianPorID(idChofer), gs.buscarGuardianPorID(idAcompañante), ss.buscarSacerdotePorID(idSacerdote)));
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

    public ArrayList<Guardia> listarGuardia() {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.listaGuardias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar la lista de las Guardias");
        }
        return null;
    }

    public void modificarGuardia(int id, LocalDate fecha, int idVocal, int idTelefonista, int idChofer, int idAcompañante, int idSacerdote) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            PedidoService ps = new PedidoService();
            dao.guardarGuardia(new Guardia(idSacerdote, fecha, gs.buscarGuardianPorID(idVocal), gs.buscarGuardianPorID(idTelefonista), gs.buscarGuardianPorID(idChofer), gs.buscarGuardianPorID(idAcompañante), ss.buscarSacerdotePorID(idSacerdote)));
            JOptionPane.showMessageDialog(null, "Se creo modifico correctamente la guardia");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente la guardia");
        }
    }

    public ArrayList<Guardia> listaDeGuardiaSacerdote(int IDSacerdote) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.listaDeGuardiaSacerdote(IDSacerdote);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo retornar correctamente la lista de las guardias de los Sacerdotes");
        }
        return null;
    }

    public ArrayList<Guardia> listaDeGuardiaDeGuardianes(int IDGuardian) {
        try {
            GuardiaDAO dao = new GuardiaDAO();
            return dao.listaDeGuardiaDeGuardianes(IDGuardian);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo retornar correctamente la lista de las guardias de los Guardianes");
        }
        return null;
    }
}

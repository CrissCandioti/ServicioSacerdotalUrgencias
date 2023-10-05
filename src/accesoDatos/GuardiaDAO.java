/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Guardia;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import service.GuardianService;
import service.SacerdoteService;

/**
 *
 * @author criss
 */
public final class GuardiaDAO extends DAO {

    public void guardarGuardia(Guardia aux) {
        try {
            String sql = "INSERT INTO `guardia`(`fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`) VALUES ('" + aux.getFecha() + "'," + aux.getIdVocal().getIdGuardian() + "," + aux.getIdTelefonista().getIdGuardian() + "," + aux.getIdChofer().getIdGuardian() + "," + aux.getIdAcompañante().getIdGuardian() + "," + aux.getIdSacerdote().getIdSacerdote() + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al guardar la guardia en la base de datos");
        }
    }

    public Guardia buscarGuardiaPorID(int id) {
        try {
            String sql = "SELECT `idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote` FROM `guardia` WHERE idGuardia = " + id;
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            Guardia aux = null;
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);
                aux = new Guardia(id, localDate, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la guardia en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Guardia> listaGuardias() {
        try {
            String sql = "SELECT `idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote` FROM `guardia` ";
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            ArrayList<Guardia> listaRetornar = new ArrayList<>();
            Guardia aux = null;
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);
                aux = new Guardia(resultado.getInt(1), localDate, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex));
                listaRetornar.add(aux);
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la lista de los guardianes en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void modificarGuardia(Guardia aux) {
        try {
            String sql = "UPDATE `guardia` SET `fecha`='" + aux.getFecha() + "',`idVocal`=" + aux.getIdVocal() + ",`idTelefonista`=" + aux.getIdTelefonista() + ",`idChofer`=" + aux.getIdChofer() + ",`idAcompañante`=" + aux.getIdAcompañante() + ",`idSacerdote`= " + aux.getIdSacerdote() + " WHERE idGuardia = " + aux.getIdGuardia();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al modificar la guardia en la base de datos");
        }
    }

}

/**
 * Crear un inner join para traer todas las guardias la cual estuvo el sacerdote
 * Tambien crear un inner join para traer las guardias que estuvieron los
 * guardianes
 * Se puede crear un metodo que te retorne la guardia del dia para guardar el pedido.
 */

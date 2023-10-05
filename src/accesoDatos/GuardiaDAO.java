/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Guardia;
import entidades.Guardian;
import entidades.Sacerdote;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import service.GuardianService;
import service.PedidoService;
import service.SacerdoteService;

/**
 *
 * @author criss
 */
public final class GuardiaDAO extends DAO {

    public void guardarGuardia(Guardia aux) {
        try {
            String sql = "INSERT INTO `guardia`(`fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`, `idPedido`) "
                    + "VALUES ('" + aux.getFecha() + "'," + aux.getIdVocal().getIdGuardian() + "," + aux.getIdTelefonista().getIdGuardian() + "," + aux.getIdChofer().getIdGuardian() + "," + aux.getIdAcompañante().getIdGuardian() + "," + aux.getIdSacerdote().getIdSacerdote() + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al guardar la guardia en la base de datos");
        }
    }

    public Guardia buscarGuardiaPorID(int id) {
        try {
            String sql = "SELECT `idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`, `idPedido` FROM `guardia` WHERE idGuardia = " + id;
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            PedidoService ps = new PedidoService();
            Guardia aux = null;
            while (resultado.next()) {
                aux = new Guardia();
                //-----------------------------------------------------
                aux.setIdGuardia(id);
                //-----------------------------------------------------
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux.setFecha(localDate);
                //-----------------------------------------------------
                Integer idVocalIndex = resultado.getInt(3);
                Guardian idVocal = gs.buscarGuardianPorID(idVocalIndex);
                aux.setIdVocal(idVocal);
                //-----------------------------------------------------
                Integer idTelefonistaIndex = resultado.getInt(4);
                Guardian idTelefonista = gs.buscarGuardianPorID(idTelefonistaIndex);
                aux.setIdTelefonista(idTelefonista);
                //-----------------------------------------------------
                Integer idChoferIndex = resultado.getInt(5);
                Guardian idChofer = gs.buscarGuardianPorID(idChoferIndex);
                aux.setIdChofer(idChofer);
                //-----------------------------------------------------
                Integer idAcompañanteIndex = resultado.getInt(6);
                Guardian idAcompañante = gs.buscarGuardianPorID(idAcompañanteIndex);
                aux.setIdAcompañante(idAcompañante);
                //-----------------------------------------------------
                Integer idSacerdoteIndex = resultado.getInt(7);
                Sacerdote idSacerdote = ss.buscarSacerdotePorID(idSacerdoteIndex);
                aux.setIdSacerdote(idSacerdote);
                //-----------------------------------------------------
                Integer idPedidoIndex = resultado.getInt(8);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la guardia en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
}

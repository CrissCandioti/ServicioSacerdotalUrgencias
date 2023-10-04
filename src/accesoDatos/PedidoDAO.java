/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Pedido;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import service.EnfermoService;
import service.GuardiaService;

/**
 *
 * @author criss
 */
public final class PedidoDAO extends DAO {

    public void guardarPedido(Pedido aux) {
        try {
            String sql = "INSERT INTO `pedido`(`fechaPedido`, `idGuardia`, `idEnfermo`) VALUES ('" + aux.getFechaPedido() + "'," + aux.getIdGuardia().getIdGuardia() + "," + aux.getIdEnfermo().getIdEnfermo() + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el pedido en la base de datos");
        }
    }

    public Pedido buscarPedidoPorID(int id) {
        try {
            String sql = "SELECT `idPedido`, `fechaPedido`, `idGuardia`, `idEnfermo` FROM `pedido` WHERE idPedido = " + id;
            consultarBaseDatos(sql);
            GuardiaService gs = new GuardiaService();
            EnfermoService es = new EnfermoService();
            Pedido aux = null;
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idGuardia = resultado.getInt(3);
                Integer idEnfermo = resultado.getInt(4);
                aux = new Pedido(id, localDate, gs.buscarGuardiaPorID(idGuardia), es.buscarEnfermoPorID(idEnfermo));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el pedido en la base de datos");
        }
        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Pedido;
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
            String sql = "";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el pedido en la base de datos");
        }
    }

    public Pedido buscarPedidoPorID(int id) {
        try {
            String sql = "SELECT `idPedido`, `fechaPedido`, `idGuardia`, `idEnfermo` FROM `pedido` WHERE idPedido = " + id;
            consultarBaseDatos(sql);
            GuardiaService gs = new GuardiaService();
            EnfermoService ef = new EnfermoService();
            Pedido aux = null;
            while (resultado.next()) {                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el pedido en la base de datos");
        }
        return null;
    }

}

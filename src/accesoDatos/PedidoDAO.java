/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Pedido;
import javax.swing.JOptionPane;

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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.PedidoDAO;
import entidades.Pedido;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class PedidoService {

    public void crearPedido(LocalDate fechaPedido, int idGuardia, int idEnfermo) {
        try {
            PedidoDAO dao = new PedidoDAO();
            EnfermoService es = new EnfermoService();
            GuardiaService gs = new GuardiaService();
            dao.guardarPedido(new Pedido(fechaPedido, gs.buscarGuardiaPorID(idGuardia), es.buscarEnfermoPorID(idEnfermo)));
            JOptionPane.showMessageDialog(null, "Se registro correctamente el pedido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el pedido");
        }
    }

    public Pedido buscarPedidoPorID(int id) {
        try {
            PedidoDAO dao = new PedidoDAO();
            return dao.buscarPedidoPorID(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el pedido");
        }
        return null;
    }
}

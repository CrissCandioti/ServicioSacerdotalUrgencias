/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.GuardiaDAO;
import accesoDatos.PedidoDAO;
import entidades.Enfermo;
import entidades.Guardia;
import entidades.Pedido;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.RegistroEnfermoContactoPedido;

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
            limpiar();
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

    public ArrayList<Pedido> obtenerListaPedidos() {
        try {
            PedidoDAO dao = new PedidoDAO();
            return dao.obtenerPedidos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al listar los pedidos");
        }
        return null;
    }

    public ArrayList<Pedido> obtenerPedidosPorFecha(LocalDate fecha) {
        try {
            PedidoDAO dao = new PedidoDAO();
            return dao.obtenerPedidosPorFecha(fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al listar los pedidos solicitados por medio de una fecha especifica");
        }
        return null;
    }

    public void modificarPedido(int id, LocalDate fechaPedido, int idGuardia, int idEnfermo) {
        try {
            PedidoDAO dao = new PedidoDAO();
            GuardiaService gs = new GuardiaService();
            EnfermoService es = new EnfermoService();
            if (gs.buscarGuardiaPorID(idGuardia) == null) {
                JOptionPane.showMessageDialog(null, "La guardia solicitada no esta registrada en nuestra base de datos");
                return;
            }
            if (es.buscarEnfermoPorID(idEnfermo) == null) {
                JOptionPane.showMessageDialog(null, "El enfermo solicitado no esta registrado en nuestra base de datos");
                return;
            }
            dao.modificarPedido(new Pedido(id, fechaPedido, gs.buscarGuardiaPorID(idGuardia), es.buscarEnfermoPorID(idEnfermo)));
            JOptionPane.showMessageDialog(null, "Se modifico con exito el pedido");
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar modificar el pedido");
        }
    }

    public ArrayList<Enfermo> obtenerEnfermosPorFecha(LocalDate fechaPedido) {
        try {
            PedidoDAO dao = new PedidoDAO();
            return dao.obtenerEnfermosPorFecha(fechaPedido);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener los enfermos por la fecha");
        }
        return null;
    }

    public ArrayList<Pedido> obtenerPedidoEntreDosFechas(LocalDate fecha1, LocalDate fecha2) {
        try {
            PedidoDAO dao = new PedidoDAO();
            return dao.obtenerPedidoEntreDosFechas(fecha1, fecha2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener el pedido entre dos fechas");
        }
        return null;
    }
        

    private void limpiar() {
        RegistroEnfermoContactoPedido.txtApellidoC.setText("");
        RegistroEnfermoContactoPedido.txtApellidoE.setText("");
        RegistroEnfermoContactoPedido.txtDescripcion.setText("");
        RegistroEnfermoContactoPedido.txtDomicilio.setText("");
        RegistroEnfermoContactoPedido.txtEdadE.setText("");
        RegistroEnfermoContactoPedido.txtNombreC.setText("");
        RegistroEnfermoContactoPedido.txtNombreE.setText("");
        RegistroEnfermoContactoPedido.txtParentesco.setText("");
        RegistroEnfermoContactoPedido.txtSanatorio.setText("");
        RegistroEnfermoContactoPedido.txtTelefono.setText("");
        RegistroEnfermoContactoPedido.cmbEstadoCivil.setSelectedIndex(0);
        RegistroEnfermoContactoPedido.cmbEconciencia.setSelectedIndex(0);
        
    }
}

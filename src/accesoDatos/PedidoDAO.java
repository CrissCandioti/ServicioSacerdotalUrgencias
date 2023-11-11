/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Enfermo;
import entidades.Pedido;
import java.time.LocalDate;
import java.util.ArrayList;
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
            String sql = "INSERT INTO `pedido`( `fechaPedido`, `idGuardia`, `idEnfermo`) VALUES ('" + aux.getFechaPedido() + "'," + aux.getIdGuardia().getIdGuardia() + "," + aux.getIdEnfermo().getIdEnfermo() + ")";
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

    public ArrayList<Pedido> obtenerPedidos() {
        try {
            String sql = "SELECT `idPedido`, `fechaPedido`, `idGuardia`, `idEnfermo` FROM `pedido`";
            consultarBaseDatos(sql);
            GuardiaService gs = new GuardiaService();
            EnfermoService es = new EnfermoService();
            ArrayList<Pedido> listaPedidoRetornar = new ArrayList<>();
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                listaPedidoRetornar.add(new Pedido(resultado.getInt(1), localDate, gs.buscarGuardiaPorID(resultado.getInt(3)), es.buscarEnfermoPorID(resultado.getInt(4))));
            }
            return listaPedidoRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al traer los pedidos de la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Pedido> obtenerPedidosPorFecha(LocalDate fecha) {
        try {
            String sql = "SELECT `idPedido`, `fechaPedido`, `idGuardia`, `idEnfermo` FROM `pedido` WHERE fechaPedido = " + fecha;
            consultarBaseDatos(sql);
            ArrayList<Pedido> listaRetornar = new ArrayList<>();
            GuardiaService gs = new GuardiaService();
            EnfermoService es = new EnfermoService();
            while (resultado.next()) {
                listaRetornar.add(new Pedido(resultado.getInt(1), fecha, gs.buscarGuardiaPorID(resultado.getInt(3)), es.buscarEnfermoPorID(resultado.getInt(4))));
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar retornar la lista de pedidos por filtro de la fecha en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void modificarPedido(Pedido aux) {
        try {
            String sql = "UPDATE `pedido` SET `fechaPedido`='" + aux.getFechaPedido() + "',`idGuardia`=" + aux.getIdGuardia().getIdGuardia() + ",`idEnfermo`=" + aux.getIdEnfermo().getIdEnfermo() + " WHERE idPedido = " + aux.getIdPedido();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar modificar el pedido solicitado en la base de datos");
        }
    }

    public ArrayList<Enfermo> obtenerEnfermosPorFecha(LocalDate fecha) {
        try {
            String sql = "SELECT `idEnfermo` FROM `pedido` WHERE fechaPedido = " + fecha;
            consultarBaseDatos(sql);
            ArrayList<Enfermo> listRetornar = new ArrayList<>();
            EnfermoService es = new EnfermoService();
            while (resultado.next()) {
                listRetornar.add(es.buscarEnfermoPorID(resultado.getInt(1)));
            }
            return listRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar modificar el pedido solicitado en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Pedido> obtenerPedidoEntreDosFechas(LocalDate fecha1, LocalDate fecha2) {
        try {
            String sql = "SELECT `idPedido`, `fechaPedido`, `idGuardia`, `idEnfermo` FROM `pedido` WHERE `fechaPedido` BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
            consultarBaseDatos(sql);
            ArrayList<Pedido> listaRetornar = new ArrayList<>();
            GuardiaService gs = new GuardiaService();
            EnfermoService es = new EnfermoService();
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                listaRetornar.add(new Pedido(resultado.getInt(1), localDate, gs.buscarGuardiaPorID(resultado.getInt(3)), es.buscarEnfermoPorID(resultado.getInt(4))));
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al retornar esos pedidos en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
}

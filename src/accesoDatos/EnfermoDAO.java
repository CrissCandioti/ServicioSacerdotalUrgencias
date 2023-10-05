/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Enfermo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import service.ContactoService;

/**
 *
 * @author criss
 */
public final class EnfermoDAO extends DAO {

    public void guardarEnfermo(Enfermo aux) {
        try {
            String sql = "INSERT INTO `enfermo`(`apellido`, `nombre`, `edad`, `estadoCivil`, `estadoConciencia`, `domicilio`, `sanatorio`, `descripcion`, `idContacto`) VALUES ('" + aux.getApellido() + "','" + aux.getNombre() + "'," + aux.getEdad() + ",'" + aux.getEstadoCivil() + "','" + aux.getEstadoConciencia() + "','" + aux.getDomicilio() + "','" + aux.getSanatorio() + "','" + aux.getDescripcion() + "'," + aux.getIdContacto().getIdContacto() + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al guardar el enfermo en la base de datos");
        }
    }

    public Enfermo buscarEnfermoPorID(int id) {
        try {
            String sql = "SELECT `idEnfermo`, `apellido`, `nombre`, `edad`, `estadoCivil`, `estadoConciencia`, `domicilio`, `sanatorio`, `descripcion`, `idContacto` FROM `enfermo` WHERE idEnfermo = " + id;
            consultarBaseDatos(sql);
            ContactoService cs = new ContactoService();
            Enfermo aux = null;
            while (resultado.next()) {
                Integer idContacto = resultado.getInt(10);
                aux = new Enfermo(id, resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8), resultado.getString(9), cs.buscarContactoPorID(idContacto));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar el enfermo en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Enfermo> listaEnfermos() {
        try {
            String sql = "SELECT `idEnfermo`, `apellido`, `nombre`, `edad`, `estadoCivil`, `estadoConciencia`, `domicilio`, `sanatorio`, `descripcion`, `idContacto` FROM `enfermo`";
            consultarBaseDatos(sql);
            ArrayList<Enfermo> listaRetornar = new ArrayList<>();
            Enfermo aux = null;
            ContactoService cs = new ContactoService();
            while (resultado.next()) {
                Integer idContacto = resultado.getInt(10);
                aux = new Enfermo(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8), resultado.getString(9), cs.buscarContactoPorID(idContacto));
                listaRetornar.add(aux);
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al traer la lista de los enfermos de la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void eliminarEnfermo(int id) {
        try {
            String sql = "DELETE FROM `enfermo` WHERE idEnfermo = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al eliminar el enfermo de la base de datos");
        }
    }

    public void modificarEnfermo(Enfermo aux) {
        try {
            String sql = "UPDATE `enfermo` SET `apellido`='" + aux.getApellido() + "',`nombre`='" + aux.getNombre() + "',`edad`=" + aux.getEdad() + ",`estadoCivil`='" + aux.getEstadoCivil() + "',`estadoConciencia`='" + aux.getEstadoConciencia() + "',`domicilio`='" + aux.getDomicilio() + "',`sanatorio`='" + aux.getSanatorio() + "',`descripcion`='" + aux.getDescripcion() + "',`idContacto`= " + aux.getIdContacto().getIdContacto() + " WHERE idEnfermo = " + aux.getIdEnfermo();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al eliminar el enfermo de la base de datos");
        }
    }
}

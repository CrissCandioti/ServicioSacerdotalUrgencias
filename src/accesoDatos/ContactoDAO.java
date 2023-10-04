/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Contacto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public final class ContactoDAO extends DAO {

    public void guardarContacto(Contacto aux) {
        try {
            String sql = "INSERT INTO `contacto`(`apellido`, `nombre`, `telefono`, `parentesco`) VALUES ('" + aux.getApellido() + "','" + aux.getNombre() + "','" + aux.getTelefono() + "','" + aux.getParentesco() + "')";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el contacto en la base de datos");
        }
    }

    public void eliminarContacto(int id) {
        try {
            String sql = "DELETE FROM `contacto` WHERE idContacto = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar eliminar el contacto de la base de datos");
        }
    }

    public Contacto buscarContactoPorID(int id) {
        try {
            String sql = "SELECT `idContacto`, `apellido`, `nombre`, `telefono`, `parentesco` FROM `contacto` WHERE idContacto = " + id;
            consultarBaseDatos(sql);
            Contacto aux = null;
            while (resultado.next()) {
                aux = new Contacto(id, resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el Contacto de la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void modificarContacto(Contacto aux) {
        try {
            String sql = "UPDATE `contacto` SET `apellido`='" + aux.getApellido() + "',`nombre`='" + aux.getNombre() + "',`telefono`='" + aux.getTelefono() + "',`parentesco`='" + aux.getParentesco() + "' WHERE idContacto = " + aux.getIdContacto();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar modificar el Contacto de la base de datos");
        }
    }

    public ArrayList<Contacto> listaContactos() {
        try {
            String sql = "SELECT `idContacto`, `apellido`, `nombre`, `telefono`, `parentesco` FROM `contacto` ORDER BY apellido ASC";
            consultarBaseDatos(sql);
            ArrayList<Contacto> listaRetornar = new ArrayList<>();
            Contacto aux = null;
            while (resultado.next()) {
                aux = new Contacto(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5));
                listaRetornar.add(aux);
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar listar el Contacto de la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
}

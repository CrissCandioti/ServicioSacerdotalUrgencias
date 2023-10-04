/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Contacto;
import entidades.Enfermo;
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
                Contacto contaco = cs.buscarContactoPorID(idContacto);
                aux = new Enfermo(id, resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8), resultado.getString(9), contaco);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar el enfermo en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Sacerdote;
import java.time.LocalDate;
import javax.swing.JOptionPane;


/**
 *
 * @author criss
 */
public final class SacerdoteDAO extends DAO {

    public void guardarSacerdote(Sacerdote aux, int index) {
        try {
            String sql = "INSERT INTO `sacerdote`(`dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado`) VALUES ('" + aux.getDni() + "','" + aux.getApellido() + "','" + aux.getNombre() + "','" + aux.getTelefono() + "','" + aux.getFechaNacimiento() + "'," + index + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el Sacerdote en la base de datos");
        }
    }

    public Sacerdote buscarSacerdotePorID(int id) {
        try {
            String sql = "SELECT `idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado` FROM `sacerdote` WHERE idSacerdote = " + id;
            consultarBaseDatos(sql);
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(id, resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), localDate, estado);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el Sacerdote en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public Sacerdote buscarSacerdotePorDNI(String dni) {
        try {
            String sql = "SELECT `idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado` FROM `sacerdote` WHERE dni = " + dni;
            consultarBaseDatos(sql);
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(resultado.getInt(1), dni, resultado.getString(3), resultado.getString(4), resultado.getString(5), localDate, estado);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el Sacerdote en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
}
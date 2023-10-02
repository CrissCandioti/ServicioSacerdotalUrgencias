/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Guardian;
import entidades.Sacerdote;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class SacerdoteDAO extends DAO {
    
    public void guardarSacerdote(Sacerdote aux, int index) {
        try {
            String sql = "INSERT INTO `sacerdote`( `dni`,`apellido`, `nombre`,`telefono`, `fechaNacimiento`, `estado`) "
                    + "VALUES ('" + aux.getDni() + "','" + aux.getApellido() + "','" + aux.getNombre() + "','" + aux.getTelefono() + "',"
                    + "'" + aux.getFechaNacimiento() + "', " + index + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el Sacerdote en la base de datos");
        }
    }
}

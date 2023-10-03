/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Contacto;
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Guardian;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class GuardianDAO extends DAO {
    
    public void guardarAlumno(Guardian aux, int index) {
        try {
            String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) VALUES ('" + aux.getApellido() + "','" + aux.getNombre() + "','" + aux.getFechaNacimiento() + "', " + index + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el alumno en la base de datos");
        }
    }
}

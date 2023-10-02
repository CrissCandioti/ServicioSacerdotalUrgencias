/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.GuardianDAO;
import entidades.Guardian;
import java.time.LocalDate;

/**
 *
 * @author criss
 */
public class GuardianService {
    
    public void crearGuardian(String apellido, String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String esctadoCivil, String rol, boolean estado){
        
        GuardianDAO dao = new GuardianDAO();
        
        Guardian aux = new Guardian(apellido, nombre, direccion, telefono, fechaNacimiento, esctadoCivil, rol, estado);
        
        int index = 0;
        if (estado == true) {
            index=1;
        }else if (estado == false){
            index=0;
        }
        
        dao.guardarAlumno(aux, index);
    
       
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.GuardianDAO;
import accesoDatos.SacerdoteDAO;
import entidades.Guardian;
import entidades.Sacerdote;
import java.time.LocalDate;

/**
 *
 * @author criss
 */
public class SacerdoteService {
     public void crearSacerdote(String dni,String apellido, String nombre, String telefono, LocalDate fechaNacimiento, boolean estado){
        
       SacerdoteDAO d = new SacerdoteDAO();
        
        Sacerdote aux = new Sacerdote( dni,apellido, nombre, telefono, fechaNacimiento, estado);
        
        int index = 0;
        if (estado == true) {
            index=1;
        }else if (estado == false){
            index=0;
        }
        
        d.guardarSacerdote(aux, index);
    
       
    } 
}

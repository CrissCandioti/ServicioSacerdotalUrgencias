/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.EnfermoDAO;
import entidades.Enfermo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class EnfermoService {

    public void crearEnfermo(String apellido, String nombre, int edad, String estadoCivil, String estadoConciencia, String domicilio, String sanatorio, String descripcion, int idContacto) {
        try {
            EnfermoDAO ed = new EnfermoDAO();
            ContactoService cs = new ContactoService();
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
                return;
            }
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
                return;
            }
            if (estadoCivil.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del estado civil no puede estar vacia");
                return;
            }
            if (estadoConciencia.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda sobre el estado de conciencia no puede estar vacia");
                return;
            }
            if (domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del domicilio no puede estar vacia");
                return;
            }
            if (sanatorio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del sanatorio no puede estar vacia");
                return;
            }
            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la descripcion del enfermo");
                return;
            }
            if (cs.buscarContactoPorID(idContacto) == null) {
                JOptionPane.showMessageDialog(null, "No se registro ningun contacto al enfermo");
                return;
            }
            if (nombre.length() < 3 || apellido.length() < 3) {
                JOptionPane.showMessageDialog(null, "El nombre u apellido no pueden tener menos de 3 caracteres");
                return;
            }
            char primerCaracterN = nombre.charAt(0);
            char primerCaracterA = apellido.charAt(0);
            if (Character.isDigit(primerCaracterN)) {
                JOptionPane.showMessageDialog(null, "El nombre no puede comenzar con numeros");
                return;
            }
            if (Character.isDigit(primerCaracterA)) {
                JOptionPane.showMessageDialog(null, "El apellido no puede comenzar con numeros");
                return;
            }
            for (char caracter : nombre.toCharArray()) {
                if (Character.isDigit(caracter)) {
                    JOptionPane.showMessageDialog(null, "El nombre no puede contener caracteres numericos");
                    return;
                }
            }
            for (char caracter : apellido.toCharArray()) {
                if (Character.isDigit(caracter)) {
                    JOptionPane.showMessageDialog(null, "El apellido no puede contener caracteres numericos");
                    return;
                }
            }
            if (!domicilio.matches("[a-zA-Z0-9 ñÑ]+")) {
                JOptionPane.showMessageDialog(null, "El domicilio contiene caracteres no permitidos");
                return;
            }
            if (!sanatorio.matches("[a-zA-Z0-9 ñÑ]+")) {
                JOptionPane.showMessageDialog(null, "El sanatorio contiene caracteres no permitidos");
                return;
            }
            if (descripcion.length() == 150) {
                System.out.println("En la descripcion solamente puede contener exactamente 150 caracteres");
                return;
            } 
            ed.guardarEnfermo(new Enfermo(apellido, nombre, edad, estadoCivil, estadoConciencia, domicilio, sanatorio, descripcion, cs.buscarContactoPorID(idContacto)));
            JOptionPane.showMessageDialog(null, "Se agrego correctamente el enfermo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar crear el enfermo");
        }
    }

    public Enfermo buscarEnfermoPorID(int id) {
        try {
            EnfermoDAO dao = new EnfermoDAO();
            return dao.buscarEnfermoPorID(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar el enfermo");
        }
        return null;
    }

    public ArrayList<Enfermo> listaEnfermos() {
        try {
            EnfermoDAO dao = new EnfermoDAO();
            return dao.listaEnfermos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar la lista de los enfermos");
        }
        return null;
    }

    public void eliminarEnfermo(int id) {
        try {
            EnfermoDAO dao = new EnfermoDAO();
            dao.eliminarEnfermo(id);
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar el enfermo");
        }
    }

    public void modificarEnfermo(int id, String apellido, String nombre, int edad, String estadoCivil, String estadoConciencia, String domicilio, String sanatorio, String descripcion, int idContacto) {
        try {
            EnfermoDAO ed = new EnfermoDAO();
            ContactoService cs = new ContactoService();
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
                return;
            }
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
                return;
            }
            if (estadoCivil.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del estado civil no puede estar vacia");
                return;
            }
            if (estadoConciencia.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda sobre el estado de conciencia no puede estar vacia");
                return;
            }
            if (domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del domicilio no puede estar vacia");
                return;
            }
            if (sanatorio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del sanatorio no puede estar vacia");
                return;
            }
            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la descripcion del enfermo");
                return;
            }
            if (cs.buscarContactoPorID(idContacto) == null) {
                JOptionPane.showMessageDialog(null, "No se registro ningun contacto al enfermo");
                return;
            }
            if (nombre.length() < 3 || apellido.length() < 3) {
                JOptionPane.showMessageDialog(null, "El nombre u apellido no pueden tener menos de 3 caracteres");
                return;
            }
            char primerCaracterN = nombre.charAt(0);
            char primerCaracterA = apellido.charAt(0);
            if (Character.isDigit(primerCaracterN)) {
                JOptionPane.showMessageDialog(null, "El nombre no puede comenzar con numeros");
                return;
            }
            if (Character.isDigit(primerCaracterA)) {
                JOptionPane.showMessageDialog(null, "El apellido no puede comenzar con numeros");
                return;
            }
            for (char caracter : nombre.toCharArray()) {
                if (Character.isDigit(caracter)) {
                    JOptionPane.showMessageDialog(null, "El nombre no puede contener caracteres numericos");
                    return;
                }
            }
            for (char caracter : apellido.toCharArray()) {
                if (Character.isDigit(caracter)) {
                    JOptionPane.showMessageDialog(null, "El apellido no puede contener caracteres numericos");
                    return;
                }
            }
            if (!domicilio.matches("[a-zA-Z0-9 ñÑ]+")) {
                JOptionPane.showMessageDialog(null, "El domicilio contiene caracteres no permitidos");
                return;
            }
            if (!sanatorio.matches("[a-zA-Z0-9 ñÑ]+")) {
                JOptionPane.showMessageDialog(null, "El sanatorio contiene caracteres no permitidos");
                return;
            }
            if (descripcion.length() == 150) {
                System.out.println("En la descripcion solamente puede contener exactamente 150 caracteres");
                return;
            } 
            ed.modificarEnfermo(new Enfermo(id, apellido, nombre, edad, estadoCivil, estadoConciencia, domicilio, sanatorio, descripcion, cs.buscarContactoPorID(idContacto)));
            JOptionPane.showMessageDialog(null, "Se modifico correctamente el enfermo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar crear el enfermo");
        }
    }
}

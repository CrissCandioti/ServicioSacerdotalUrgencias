/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.ContactoDAO;
import entidades.Contacto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class ContactoService {

    public void crearContacto(String apellido, String nombre, String telefono, String parentesco) {
        try {
            ContactoDAO dao = new ContactoDAO();
//            if (apellido.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
//                return;
//            }
//            if (nombre.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
//                return;
//            }
//            if (telefono.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del telefono no puede estar vacia");
//                return;
//            }
//            if (parentesco.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del parentesco no puede estar vacia");
//                return;
//            }
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
            if (!telefono.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El telefono solamente debe contener digitos numericos");
                return;
            }
            if (!parentesco.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "El parentesco solamente puede tener letras");
                return;
            }
            dao.guardarContacto(new Contacto(apellido, nombre, telefono, parentesco));
            System.out.println("Se Guardo contacto del enfermo...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el Contacto del enfermo");
        }
    }

    public void eliminarContacto(int id) {
        try {
            ContactoDAO dao = new ContactoDAO();
            dao.eliminarContacto(id);
            JOptionPane.showMessageDialog(null, "Se elimino correctamente el contacto del enfermo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el contacto seleccionado");
        }
    }

    public Contacto buscarContactoPorID(int id) {
        try {
            ContactoDAO dao = new ContactoDAO();
            return dao.buscarContactoPorID(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el contacto del enfermo");
        }
        return null;
    }
    public Contacto buscarContactoPorNombreYapellido(String apellido, String nombre) {
        try {
            ContactoDAO dao = new ContactoDAO();
            return dao.buscarContactoPorNombreYapellido(apellido, nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el contacto del enfermo");
        }
        return null;
    }

    public void modificarContacto(int ID, String apellido, String nombre, String telefono, String parentesco) {
        try {
            ContactoDAO dao = new ContactoDAO();
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
                return;
            }
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
                return;
            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del telefono no puede estar vacia");
                return;
            }
            if (parentesco.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del parentesco no puede estar vacia");
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
            if (!telefono.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El telefono solamente debe contener digitos numericos");
                return;
            }
            if (!parentesco.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "El parentesco solamente puede tener letras");
                return;
            }
            dao.modificarContacto(new Contacto(ID, apellido, nombre, telefono, parentesco));
            JOptionPane.showMessageDialog(null, "Se modifico correctamente el contacto del enfermo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el Contacto del enfermo");
        }
    }

    public ArrayList<Contacto> listaContactos() {
        try {
            ContactoDAO dao = new ContactoDAO();
            return dao.listaContactos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer la listas de Contactos");
        }
        return null;

    }
}

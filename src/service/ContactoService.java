/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.ContactoDAO;
import entidades.Contacto;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class ContactoService {

    public void crearContacto(String apellido, String nombre, String telefono, String parentesco) {
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
            Contacto aux = new Contacto(apellido, nombre, telefono, parentesco);
            dao.guardarContacto(aux);
            JOptionPane.showMessageDialog(null, "Se guardo correctamente el contacto del enfermo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el Contacto del enfermo");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosacerdotalurgencias.Service;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import serviciosacerdotalurgencias.AccesoDatos.SacerdoteDAO;
import serviciosacerdotalurgencias.Entidades.Sacerdote;

/**
 *
 * @author criss
 */
public class SacerdoteService {

    public void crearSacerdote(String dni, String apellido, String nombre, String telefono, LocalDate fechaNacimiento, boolean estado) {
        try {
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del dni no puede estar vacia");
                return;
            }
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
            /**
             * Esta restriccion esta hecha para que el documento que ingrese el
             * usuario solamente admita caracteres numericos. Si contiene
             * letras,espacios o algun caracteres diferenete se presentara un
             * mensaje de error evitando seguir con la creacion del Sacerdote
             */
            if (dni.matches("^[^a-zA-Z*\\s]{7,9}$")) {
                System.out.println("La cadena cumple con los requisitos.");
            } else {
                JOptionPane.showMessageDialog(null, "El documento no cumple con los requisitos, por favor verifique e intente nuevamente");
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
            if (telefono.matches("\\d+")) {
                System.out.println("El telefono contiene solo digitos numericos");
            } else {
                JOptionPane.showMessageDialog(null, "El telefono solamente debe contener digitos numericos");
                return;
            }
            SacerdoteDAO dao = new SacerdoteDAO();
            Sacerdote aux = new Sacerdote();
            aux.setDni(dni);
            aux.setApellido(apellido);
            aux.setNombre(nombre);
            aux.setTelefono(telefono);
            aux.setFechaNacimiento(fechaNacimiento);
            aux.setEstado(estado);
            int index = 0;
            if (estado == true) {
                index = 1;
            } else if (estado == false) {
                index = 0;
            }
            dao.guardarSacerdote(aux, index);
            JOptionPane.showMessageDialog(null, "Se registro correctamente el Sacerdote");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente el Sacerdote");
        }
    }

    public Sacerdote buscarSacerdotePorID(int id) {
        try {
            SacerdoteDAO dao = new SacerdoteDAO();
            return dao.buscarSacerdotePorID(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar al Sacerdote por ID");
        }
        return null;
    }

    public Sacerdote buscarSacerdotePorDNI(String dni) {
        try {
            SacerdoteDAO dao = new SacerdoteDAO();
            return dao.buscarSacerdotePorDNI(dni);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar al Sacerdote por DNI");
        }
        return null;
    }
}

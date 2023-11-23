/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import accesoDatos.GuardianDAO;
import entidades.Guardian;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.RegistroGuardianes;

/**
 * El paquete Service contiene las clases entidadesServices. Estas clases estan
 * en constante comunicacion con el paquete "Vista" y con el paquete "Acceso a
 * Datos" Estas clases primero reciben los datos obtenidos de las "Vistas",
 * luego cada uno de los metodos ubicados dentro de las clases Services se
 * encargan de analizar y de cumplir las restricciones programadas. Una vez de
 * desempeñar con la tarea asignada cada metodo establece una comunicacion con
 * el paquete "Acceso a Datos", la cual se encarga de enviarle esta informacion.
 */
public class GuardianService {

    /*
     * El metodo "crearGuardian" recibe toda la informacion establecida en la
     * vistas para completar el registro del guardian
     */
    public void crearGuardian(String dni, String apellido, String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String estadoCivil, String rol, boolean estado,int nivel) {
        /**
         * Dentro de un bloque try-catch el metodo procede a analizar estos
         * datos con las restricciones
         */
        try {
            GuardianDAO dao = new GuardianDAO();
            /**
             * Las siguientes restricciones fueron creadas para que los datos
             * ingresados no esten vacios y cumplan con las condiciones para la
             * creacion del guardian
             */
//            if (dni.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del dni no puede estar vacia");
//                return;
//            }
//            if (apellido.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del apellido no puede estar vacia");
//                return;
//            }
//            if (nombre.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del nombre no puede estar vacia");
//                return;
//            }
//            if (direccion.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda de la direccion no puede estar vacia");
//                return;
//            }
//            if (telefono.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del telefono no puede estar vacia");
//                return;
//            }
//            if (estadoCivil.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del estado civil no puede estar vacia");
//                return;
//            }
//            if (rol.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "La celda del rol no puede estar vacia");
//                return;
//            }
            if (dao.buscarGuardianPorDNI(dni) != null) {
                JOptionPane.showMessageDialog(null, "Tenemos asociado un Guardian a ese documento");
                return;
            }
            /**
             * Esta restriccion esta hecha para que el documento que ingrese el
             * usuario solamente admita caracteres numericos. Si contiene
             * letras,espacios o algun caracteres diferenete se presentara un
             * mensaje de error evitando seguir con la creacion del Sacerdote
             */
            if (!dni.matches("^[^a-zA-Z*\\s]{7,9}$")) {
                JOptionPane.showMessageDialog(null, "El documento no cumple con los requisitos, por favor verifique e intente nuevamente");
                return;
            }
            /**
             * Esta restriccion es la encarga de analizar la cantidad minima de
             * caracter que aceptan los datos del nombre y apellido
             */
            if (nombre.length() < 3 || apellido.length() < 3) {
                JOptionPane.showMessageDialog(null, "El nombre u apellido no pueden tener menos de 3 caracteres");
                return;
            }
            /**
             * Esta restriccion se encarga de buscar dentro del nombre y el
             * apellido si comienza con datos numericos
             */
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
            /**
             * Esta restriccion esta creada para que el usuario no ingrese un
             * nombre o apellido con caracteres numericos.
             */
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
            /**
             * Esta restriccion fue creada para que analice el dato telefonico
             * para que solo admita digitos numericos
             */
            if (!telefono.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El telefono solamente debe contener digitos numericos");
                return;
            }
            /**
             * Esta restriccion fue creada para analizar la direccion para que
             * solamente contenga caracteres numericos, letras y espacios; no
             * admite otros tipos de caracteres
             */
            if (!direccion.matches("[a-zA-Z0-9 ñÑ]+")) {
                JOptionPane.showMessageDialog(null, "La direccion contiene caracteres no permitidos");
                return;
            }
            /**
             * Debido que nuestra base de datos la variable "estado" solo acepta
             * un numero entero; si es 0 es false y su es 1 es true Este
             * condicional if se encarga de analizar el dato boolean "estado"
             * obtenido de la vista y a crea una variable de dato entero para
             * enviar a la base de datos el correspondiente
             */
            int index = 0;
            if (estado == true) {
                index = 1;
            } else if (estado == false) {
                index = 0;
            }
            /**
             * Una vez cumplida las restricciones el metodo se encarga de
             * instanciar un guardian con esos datos obtenidos. Se establece la
             * comunicacion con el paquete "Acceso a datos" la cual se envia por
             * argumentos el guardian instanciado y la variable entero con el
             * dato correcto del estado para registrar en la base de datos
             */
            dao.guardarGuardian(new Guardian(dni, apellido, nombre, direccion, telefono, fechaNacimiento, estadoCivil, rol, estado,nivel), index);
            /**
             * Por ultimo se muestra un mensaje completando el registro
             */
            JOptionPane.showMessageDialog(null, "Registramos correctamente al Guardian");
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente el Guardian");
        }
    }

    /*
     * El metodo inhabilitarGuardian se encarga de setear el estado del Guardian, este
     * no elimina fisicamente el Guardian sino cambia su estado a inactivo.
     */
    public void inhabilitarGuardian(int id) {
        try {
            /**
             * Se establece la comunicacion con "Acceso a Datos" la cual envia
             * por argumento el id recibido para efectuar la baja
             */
            GuardianDAO dao = new GuardianDAO();
            /**
             * Se crea una restriccion encargada de verificar si el Guardian
             * esta inhabilitado.
             */
            if (dao.buscarGuardianPorID(id).isEstado() == false) {
                JOptionPane.showMessageDialog(null, "El Guardian ya fue inhabilitado");
                return;
            }
            dao.inhabilitarGuardian(id);
            JOptionPane.showMessageDialog(null, "Guardian inhabilitado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar inhabilitar el Guardian" +e);
        }
    }

    /*
     * Este metodo se creo para que me busque un guardian recibiendo por
     * parametro el ID
     */
    public Guardian buscarGuardianPorID(int id) {
        try {
            GuardianDAO dao = new GuardianDAO();
            return dao.buscarGuardianPorID(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar al Guardian");
        }
        return null;
    }

    /*
     * Este metodo fue creado para buscar el Guardian por DNI.
     */
    public Guardian buscarGuardianPorDNI(String dni) {
        try {
            GuardianDAO dao = new GuardianDAO();
            return dao.buscarGuardianPorDNI(dni);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar al Guardian");
        }
        return null;
    }

    /*
     * Este metodo fue creado para que me retorne una lista con todos los
     * guardianes.
     */
    public ArrayList<Guardian> listaGuardianes() {
        try {
            GuardianDAO dao = new GuardianDAO();
            return dao.listaGuardianes();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar mostrar la lista de Guardianes");
        }
        return null;
    }

    /*
     * Este metodo fue creado para recibir todos los datos necesarios de las
     * vistas para modificar un Guardiam. Dentro de la lista se encuentra el
     * metodo buscarGuardianPorID, la cual no servira para verificar si se
     * encuentra ese alumno a modificar.
     */
    public void modificarGuardian(int id, String dni, String apellido, String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String estadoCivil, String rol, boolean estado,int nivel) {
        try {
            GuardianDAO dao = new GuardianDAO();
            if (dao.buscarGuardianPorID(id) == null) {
                JOptionPane.showMessageDialog(null, "No se encontro el guardian para su modificacion");
                return;
            }
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
            if (direccion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda de la direccion no puede estar vacia");
                return;
            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del telefono no puede estar vacia");
                return;
            }
            if (estadoCivil.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del estado civil no puede estar vacia");
                return;
            }
            if (rol.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La celda del rol no puede estar vacia");
                return;
            }
            if (!dni.matches("^[^a-zA-Z*\\s]{7,9}$")) {
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
            if (!telefono.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El telefono solamente debe contener digitos numericos");
                return;
            }
            if (!direccion.matches("[a-zA-Z0-9 ñÑ]+")) {
                JOptionPane.showMessageDialog(null, "La direccion contiene caracteres no permitidos");
                return;
            }
            int index = 0;
            if (estado == true) {
                index = 1;
            } else if (estado == false) {
                index = 0;
            }
            dao.modificarGuardian(new Guardian(id, dni, apellido, nombre, direccion, telefono, fechaNacimiento, estadoCivil, rol, estado,nivel), index);
            JOptionPane.showMessageDialog(null, "Modificamos correctamente al Guardian");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar el Guardian");
        }
    }

    /*
     * Este metodo se creo para eliminar definitivamente el Guardian
     * seleccionado.
     */
    public void eliminarGuardian(int id) {
        try {
            GuardianDAO dao = new GuardianDAO();
            if (dao.buscarGuardianPorID(id) == null) {
                JOptionPane.showMessageDialog(null, "No se encontr el guardian para su eliminacion");
                return;
            }
            dao.eliminarGuardian(id);
            JOptionPane.showMessageDialog(null, "Se elimino exitosamente el guardian");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar el Guardian");
        }
    }

    private void limpiarCampos() {
        RegistroGuardianes.txtApelldo.setText("");
        RegistroGuardianes.txtDireccion.setText("");
        RegistroGuardianes.txtDni.setText("");
        RegistroGuardianes.txtId.setText("");
        RegistroGuardianes.txtNombre.setText("");
        RegistroGuardianes.txtTelefono.setText("");
        RegistroGuardianes.DateChooser.setDate(null);
        RegistroGuardianes.cbxEstadoCivil.getSelectedIndex();
        RegistroGuardianes.cbxRol.getSelectedIndex();
        
    }
}

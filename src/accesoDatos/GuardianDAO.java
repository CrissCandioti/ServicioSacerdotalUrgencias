/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Guardian;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Las clases de entidades DAO heredan los metodos de DAO,la cual consiste en la
 * coneccion a la base de datos, la desconecion a la base de datos, y los
 * metodos de consultas propios de DAO. Esta clase ademas de heredar se declara
 * como "final", debido a que no queremos que continue con la jerarquia de la
 * herencia. Esta clase de GuardianDAO va a contener los metodos necesarios para
 * la comunicacion de la base de datos por medio de los propios comandos.
 *
 */
public final class GuardianDAO extends DAO {

    /*
     * El metodo guardarGuardian es la encargadar de comunicarse con la base de
     * datos, realizar el comando para insertar y llamar al metodo
     * insertarModificarEliminarBaseDatos de la clase que hereda.
     */
    public void guardarGuardian(Guardian aux, int index) {
        try {
            String sql = "INSERT INTO `guardian`(`dni`, `apellido`, `nombre`, `direccion`, `telefono`, `fechaNacimiento`, `estadoCivil`, `rol`, `estado`,`nivel`) VALUES ('" + aux.getDni() + "','" + aux.getApellido() + "','" + aux.getNombre() + "','" + aux.getDireccion() + "','" + aux.getTelefono() + "','" + aux.getFechaNacimiento() + "','" + aux.getEstadoCivil() + "','" + aux.getRol() + "'," + index + ","+ aux.getNivel() +")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el Guardian en la base de datos");
        }
    }

    /*
     * //El metodo inhabilitarGuardian recibe por parametro un dato entero
     * llamado id, este metodo se encarga de inhabilitar el Guardian.
     */
    public void inhabilitarGuardian(int id) {
        try {
            String sql = "UPDATE `guardian` SET `estado`= 0 WHERE idGuardian = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar inhabilitar el Guardian de la base de datos");
        }
    }

    public Guardian buscarGuardianPorID(int id) {
        try {
            String sql = "SELECT `idGuardian`, `dni`, `apellido`, `nombre`, `direccion`, `telefono`, `fechaNacimiento`, `estadoCivil`, `rol`, `estado`,`nivel` FROM `guardian` WHERE idGuardian = " + id;
            consultarBaseDatos(sql);
            Guardian aux = null;
            boolean estado = false;
            while (resultado.next()) {
                /**
                 * Este condicional if se creo para crear el tipo de dato
                 * correspondiente de la variable estado de la entidad Guardian.
                 * En nuestra base de datos el estado es un dato entero y varia
                 * entre 1 y 0. La entidad Guardian la variable estado es de
                 * tipo boolean que varia entre true y false.
                 */
                if (resultado.getInt(10) == 0) {
                    estado = false;
                } else if (resultado.getInt(10) == 1) {
                    estado = true;
                }
                // Crear un objeto Date SQL
                java.sql.Date fechaSQL = resultado.getDate(7);
                // Se crea localDate con los valores
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Guardian(id, resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), localDate, resultado.getString(8), resultado.getString(9), estado,resultado.getInt(11));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar el Guardian en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public Guardian buscarGuardianPorDNI(String dni) {
        try {
            String sql = "SELECT `idGuardian`, `dni`, `apellido`, `nombre`, `direccion`, `telefono`, `fechaNacimiento`, `estadoCivil`, `rol`, `estado`,`nivel` FROM `guardian` WHERE dni = " + dni;
            consultarBaseDatos(sql);
            Guardian aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(10) == 0) {
                    estado = false;
                } else if (resultado.getInt(10) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(7);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Guardian(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), localDate, resultado.getString(8), resultado.getString(9), estado,resultado.getInt(11));
            }
            return aux;
        } catch (Exception e) {
            System.out.println("Se produjo un error al buscar el Guardian en la base de datos");
            //JOptionPane.showMessageDialog(null, "Se produjo un error al buscar el Guardian en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Guardian> listaGuardianes() {
        try {
            String sql = "SELECT `idGuardian`, `dni`, `apellido`, `nombre`, `direccion`, `telefono`, `fechaNacimiento`, `estadoCivil`, `rol`, `estado`,`nivel` FROM `guardian` ORDER BY idGuardian ASC ";
            consultarBaseDatos(sql);
            ArrayList<Guardian> listaARetornar = new ArrayList<>();
            Guardian aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(10) == 0) {
                    estado = false;
                } else if (resultado.getInt(10) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(7);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Guardian(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), localDate, resultado.getString(8), resultado.getString(9), estado,resultado.getInt(10));
                listaARetornar.add(aux);
            }
            return listaARetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al mostrar la lista de Guardianes de la base de datos" + e.getMessage());
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
     public Iterable<Guardian> listaGuardianesActivos() {
          try {
            String sql = "SELECT `idGuardian`, `dni`, `apellido`, `nombre`, `direccion`, `telefono`, `fechaNacimiento`, `estadoCivil`, `rol`, `estado`,`nivel` FROM `guardian` WHERE `estado`=1 ORDER BY idGuardian ASC ";
            consultarBaseDatos(sql);
            ArrayList<Guardian> listaARetornar = new ArrayList<>();
            Guardian aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(10) == 0) {
                    estado = false;
                } else if (resultado.getInt(10) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(7);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Guardian(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), localDate, resultado.getString(8), resultado.getString(9), estado,resultado.getInt(10));
                listaARetornar.add(aux);
            }
            return listaARetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al mostrar la lista de Guardianes de la base de datos" + e.getMessage());
        } finally {
            desconectarBaseDatos();
        }
        return null;
         
         }

    public void modificarGuardian(Guardian aux, int index) {
        try {
            String sql = "UPDATE `guardian` SET `dni`='" + aux.getDni() + "',`apellido`='" + aux.getApellido() + "',`nombre`='" + aux.getNombre() + "',`direccion`='" + aux.getDireccion() + "',`telefono`='" + aux.getTelefono() + "',`fechaNacimiento`='" + aux.getFechaNacimiento() + "',`estadoCivil`='" + aux.getEstadoCivil() + "',`rol`='" + aux.getRol() + "',`estado`=" + index + "',`nivel`= '" + aux.getNivel() + " WHERE idGuardian = " + aux.getIdGuardian();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar modificar el guardian en la base de datos");
        }
    }

    public void eliminarGuardian(int id) {
        try {
            String sql = "DELETE FROM `guardian` WHERE idGuardian = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar elimnar el guardian de la base de datos");
        }
    }

   
}

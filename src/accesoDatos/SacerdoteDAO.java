/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Sacerdote;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public final class SacerdoteDAO extends DAO {

    public void guardarSacerdote(Sacerdote aux, int index) {
        try {
            String sql = "INSERT INTO `sacerdote`(`dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado`) VALUES ('" + aux.getDni() + "','" + aux.getApellido() + "','" + aux.getNombre() + "','" + aux.getTelefono() + "','" + aux.getFechaNacimiento() + "'," + index + ")";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar guardar el Sacerdote en la base de datos");
        }
    }

    public Sacerdote buscarSacerdotePorID(int id) {
        try {
            String sql = "SELECT `idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado` FROM `sacerdote` WHERE idSacerdote = " + id;
            consultarBaseDatos(sql);
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(id, resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), localDate, estado);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el Sacerdote en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
    public Sacerdote buscarSacerdotePorNombreYapellido(String nombre, String apellido) {
        try {
            String sql ="SELECT * FROM sacerdote WHERE apellido= '" + apellido +"' AND nombre = '"+ nombre+"'";
            consultarBaseDatos(sql);
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(resultado.getInt(1), resultado.getString(2), apellido, nombre, resultado.getString(5), localDate, estado);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el Sacerdote en la base de datos" );
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public Sacerdote buscarSacerdotePorDNI(String dni) {
        try {
            String sql = "SELECT `idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado` FROM `sacerdote` WHERE dni = " + dni;
            consultarBaseDatos(sql);
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(resultado.getInt(1), dni, resultado.getString(3), resultado.getString(4), resultado.getString(5), localDate, estado);
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar buscar el Sacerdote en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Sacerdote> listaSacerdotesActivos() {
        try {
            String sql = "SELECT `idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado` FROM `sacerdote`WHERE `estado`= 1 ORDER BY apellido ASC";
            consultarBaseDatos(sql);
            ArrayList<Sacerdote> listaARetornar = new ArrayList<>();
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), localDate, estado);
                listaARetornar.add(aux);
            }
            return listaARetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al traer la lista de los Sacerdotes de la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
    public ArrayList listaSacerdotes() {
          try {
            String sql = "SELECT `idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado` FROM `sacerdote` ORDER BY apellido ASC";
            consultarBaseDatos(sql);
            ArrayList<Sacerdote> listaARetornar = new ArrayList<>();
            Sacerdote aux = null;
            boolean estado = false;
            while (resultado.next()) {
                if (resultado.getInt(7) == 0) {
                    estado = false;
                } else if (resultado.getInt(7) == 1) {
                    estado = true;
                }
                java.sql.Date fechaSQL = resultado.getDate(6);
                LocalDate localDate = fechaSQL.toLocalDate();
                aux = new Sacerdote(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), localDate, estado);
                listaARetornar.add(aux);
            }
            return listaARetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al traer la lista de los Sacerdotes de la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void inhabilitarSacerdote(int id) {
        try {
            String sql = "UPDATE `sacerdote` SET `estado`= 0 WHERE idSacerdote = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar inhabilitar el Sacerdote en la base de datos");
        }
    }

    public void eliminarSacerdote(int id) {
        try {
            String sql = "DELETE FROM `sacerdote` WHERE idSacerdote = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar eliminar al Sacerdote de la base de datos");
        }
    }

    public void modificarSacerdote(Sacerdote aux, int index) {
        try {
            String sql = "UPDATE `sacerdote` SET `dni`='" + aux.getDni() + "',`apellido`='" + aux.getApellido() + "',`nombre`='" + aux.getNombre() + "',`telefono`='" + aux.getTelefono() + "',`fechaNacimiento`='" + aux.getFechaNacimiento() + "',`estado`= " + index + " WHERE idSacerdote = " + aux.getIdSacerdote();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar modificar al Sacerdote en la base de datos");
        }
    }

    
}

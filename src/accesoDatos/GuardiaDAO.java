
package accesoDatos;

import entidades.Guardia;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import service.GuardianService;
import service.SacerdoteService;


public final class GuardiaDAO extends DAO {

    public void guardarGuardia(Guardia aux) {
        try {
            String sql = "INSERT INTO `guardia`(`fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`,`estado`) VALUES ('" + aux.getFecha() + "'," + aux.getIdVocal().getIdGuardian() + "," + aux.getIdTelefonista().getIdGuardian() + "," + aux.getIdChofer().getIdGuardian() + "," + aux.getIdAcompañante().getIdGuardian() + "," + aux.getIdSacerdote().getIdSacerdote() + ",'" + aux.getEstado() + "')";
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al guardar la guardia en la base de datos");
        }
    }

    public Guardia buscarGuardiaPorID(int id) {
        try {
            String sql = "SELECT `idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`,`estado` FROM `guardia` WHERE idGuardia = " + id;
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            Guardia aux = null;
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);

                aux = new Guardia(id, localDate, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex), resultado.getString(8));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la guardia en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public Guardia buscarGuardiaPorfecha(LocalDate fecha) {
        try {
            String sql = "SELECT `idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`,`estado`  FROM `guardia` WHERE fecha = '" + fecha + "'";
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            Guardia aux = null;
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);
                aux = new Guardia(resultado.getInt(1), fecha, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex), resultado.getString(8));
            }
            return aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la guardia en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Guardia> listaGuardias() {
        try {
            String sql = "SELECT `idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`,`estado` FROM `guardia` ";
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            ArrayList<Guardia> listaRetornar = new ArrayList<>();
            Guardia aux = null;
            while (resultado.next()) {
                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);
                aux = new Guardia(resultado.getInt(1), localDate, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex), resultado.getString(8));
                listaRetornar.add(aux);
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la lista de los guardianes en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }
    
    public ArrayList<Guardia> listaGuardiasDeSacerdotes(int id,LocalDate fecha1,LocalDate fecha2){
        
        
        
           try {
            String sql = "SELECT * FROM guardia WHERE idSacerdote = "+id+" AND fecha BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
            consultarBaseDatos(sql);
             GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            ArrayList<Guardia> listaRetornar = new ArrayList<>();
            Guardia aux = null;
            while (resultado.next()) {
                 java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);
                aux = new Guardia(resultado.getInt(1), 
                        localDate, 
                        gs.buscarGuardianPorID(idVocalIndex), 
                        gs.buscarGuardianPorID(idTelefonistaIndex),
                        gs.buscarGuardianPorID(idChoferIndex), 
                        gs.buscarGuardianPorID(idAcompañanteIndex),
                        ss.buscarSacerdotePorID(idSacerdoteIndex),
                        resultado.getString(8));
                listaRetornar.add(aux);
            }
            return listaRetornar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar la lista de los guardianes en la base de datos");
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void modificarGuardia(Guardia aux) {
        try {
            String sql = "UPDATE `guardia` SET `fecha`='" + aux.getFecha() + "',`idVocal`=" + aux.getIdVocal() + ",`idTelefonista`=" + aux.getIdTelefonista() + ",`idChofer`=" + aux.getIdChofer() + ",`idAcompañante`=" + aux.getIdAcompañante() + ",`idSacerdote`= " + aux.getIdSacerdote() + ",`estado`='" + aux.getEstado() + "' WHERE idGuardia = " + aux.getIdGuardia();
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al modificar la guardia en la base de datos");
        }
    }

    public Guardia mostrarEstado() {
        try {
            String sql = "SELECT * FROM guardia ORDER BY idGuardia DESC LIMIT 1";
            consultarBaseDatos(sql);
            GuardianService gs = new GuardianService();
            SacerdoteService ss = new SacerdoteService();
            Guardia aux = null;
            while (resultado.next()) {

                java.sql.Date fechaSQL = resultado.getDate(2);
                LocalDate localDate = fechaSQL.toLocalDate();
                Integer idVocalIndex = resultado.getInt(3);
                Integer idTelefonistaIndex = resultado.getInt(4);
                Integer idChoferIndex = resultado.getInt(5);
                Integer idAcompañanteIndex = resultado.getInt(6);
                Integer idSacerdoteIndex = resultado.getInt(7);
                aux = new Guardia(resultado.getInt(1), localDate, gs.buscarGuardianPorID(idVocalIndex), gs.buscarGuardianPorID(idTelefonistaIndex), gs.buscarGuardianPorID(idChoferIndex), gs.buscarGuardianPorID(idAcompañanteIndex), ss.buscarSacerdotePorID(idSacerdoteIndex), resultado.getString(8));

            }
            return aux;

        } catch (Exception e) {

        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public void modificarEstado(int id) {
        try {
            String sql = "UPDATE `guardia` SET `estado`='cerrado' WHERE idGuardia = " + id;
            insertarModificarEliminarBaseDatos(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al modificar la guardia en la base de datos");
        }
    }

    public ArrayList<Integer> buscarSacerdotePorNombreYApellido(String nombre, String apellido) {
        try {
            String sql = "SELECT  guardia.idSacerdote FROM `guardia` INNER JOIN sacerdote ON guardia.idSacerdote = sacerdote.idSacerdote WHERE sacerdote.nombre LIKE '" + nombre + "%' AND sacerdote.apellido LIKE '" + apellido + "%'";
            consultarBaseDatos(sql);
            ArrayList<Integer> listaRetornar = new ArrayList<>();
            while (resultado.next()) {
                listaRetornar.add(resultado.getInt(1));
            }
            return listaRetornar;
        } catch (Exception e) {
            System.out.println("Error en el metodo buscarSacerdotePorNombreYApellido en la clase SacerdoteDAO: " + e);
        } finally {
            desconectarBaseDatos();
        }
        return null;
    }

    public ArrayList<Integer> guardiasDeLosGuardianes(int id) {
        try {
            String sql = "SELECT  guardia.idGuardia, guardia.fecha FROM `guardia` WHERE guardia.idVocal = " + id + " OR guardia.idTelefonista = " + id + " OR guardia.idChofer = " + id + " OR guardia.idAcompañante = " + id + " ";
            consultarBaseDatos(sql);
            ArrayList<Integer> listaRetornar = new ArrayList<>();
            while (resultado.next()) {
                listaRetornar.add(resultado.getInt(1));
            }
            return listaRetornar;
        } catch (Exception e) {
            System.out.println("Error en el metodo guardiasDeLosGuardianes() en la clase GuardiaDAO: " + e);
        }
        return null;
    }

}

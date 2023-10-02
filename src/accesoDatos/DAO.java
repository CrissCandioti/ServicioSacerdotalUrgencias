/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author criss
 */
public class DAO {
    protected Connection coneccion = null;//La variable coneccion es la mas importante, porque es la encargada en la comunicacion con la base de datos.
    protected Statement sentencia = null;//La variable resultado es la que extrae la informacion de la base de datos para mostrarla, no realiza ninguna modificacion.
    protected ResultSet resultado = null;//La variable sentencia es la que almacena la infromacion de los comandos para insertar,modifica,eliminar de la base.

    private final String USER = "root";
    private final String PASSWORD = "";
    private final String DATABASE = "serviciosacerdotalurgencias";
    private final String DRIVER = "org.mariadb.jdbc.Driver";

    /*
     * Metodo que va a heredar a sus clases hijas la cual realiza la coneccion a
     * la base de datos.
     */
    protected void coneccionBaseDatos() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mariadb://localhost:3306/" + DATABASE + "?zeroDateTimeBehavior=convertToNull";
            coneccion = DriverManager.getConnection(urlBaseDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    /*
     * Metodo que va a heredar a sus clases hijas la cual realiza la
     * desconeccion a la base de datos.
     */
    protected void desconectarBaseDatos() {
        try {
            /**
             * Estos condicionales if se encargan de cerrar la comunicacion y
             * coneccion con la base de datos.
             */
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (coneccion != null) {
                coneccion.close();
            }
        } catch (Exception e) {
            System.out.println("No pudimos desconectarnos desconectado");
        }
    }

    /*
     * Metodo creado para encargarse de las operaciones con la base de datos,
     * estas son las de insertar,modificar,eliminar. El metodo recibe por
     * parametro la consulta
     */
    protected void insertarModificarEliminarBaseDatos(String sql) throws SQLException, ClassNotFoundException, Exception {
        try {
            coneccionBaseDatos();//Realizamos una coneccion a la base de datos
            sentencia = coneccion.createStatement();//Debemos volcar lo que es la potencial creacion de una sentencia. Por tal motivo preparamos la variable sentencia para recibir una consulta.
            sentencia.executeUpdate(sql);//Preparada la variable sentencia, recibe la consulta y la ejecuta 
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        } finally {
            desconectarBaseDatos();//Una vez terminada, se haya producido una excepcion o no, se desconecta de la base de datos.
        }
    }

    /*
     * Metodo creado para encargarse de las consulta, busca y retorna la
     * informacion solicitada. Este metodo tambien recibe por parametro la
     * consulta.
     */
    protected void consultarBaseDatos(String sql) throws Exception {
        try {
            coneccionBaseDatos();//Llama al metodo "coneccionBaseDatos" para establecer una comunicacion con la base de datos. 
            sentencia = coneccion.createStatement();//Preparamos la variable sentencia para recibir la consulta.
            resultado = sentencia.executeQuery(sql);//En este caso utilizamos la variable resultado para obtener los valores de la viriable sentencia.
        } catch (Exception e) {
            throw e;
        }
    }
}

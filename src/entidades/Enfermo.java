/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author criss
 */
public class Enfermo {

    private int idEnfermo;
    private String apellido;
    private String nombre;
    private int edad;
    private String estadoCivil;
    private String estadoConciencia;
    private String domicilio;
    private String sanatorio;
    private String descripcion;
    private Contacto idContacto;

    public Enfermo() {
    }

    public Enfermo(String apellido, String nombre, int edad, String estadoCivil, String estadoConciencia, String domicilio, String sanatorio, String descripcion, Contacto idContacto) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estadoConciencia = estadoConciencia;
        this.domicilio = domicilio;
        this.sanatorio = sanatorio;
        this.descripcion = descripcion;
        this.idContacto = idContacto;
    }

    public Enfermo(int idEnfermo, String apellido, String nombre, int edad, String estadoCivil, String estadoConciencia, String domicilio, String sanatorio, String descripcion, Contacto idContacto) {
        this.idEnfermo = idEnfermo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estadoConciencia = estadoConciencia;
        this.domicilio = domicilio;
        this.sanatorio = sanatorio;
        this.descripcion = descripcion;
        this.idContacto = idContacto;
    }

    public int getIdEnfermo() {
        return idEnfermo;
    }

    public void setIdEnfermo(int idEnfermo) {
        this.idEnfermo = idEnfermo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoConciencia() {
        return estadoConciencia;
    }

    public void setEstadoConciencia(String estadoConciencia) {
        this.estadoConciencia = estadoConciencia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSanatorio() {
        return sanatorio;
    }

    public void setSanatorio(String sanatorio) {
        this.sanatorio = sanatorio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Contacto getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Contacto idContacto) {
        this.idContacto = idContacto;
    }

    @Override
    public String toString() {
        return   apellido + ", " + nombre + ", \n" 
                + edad + "años , \n"
                + estadoCivil + ",\n" 
                + estadoConciencia + " \n "
                + "Domiciilio: " + domicilio + " \n"
                + " Descripcion: "+ descripcion +",\n"
                + "\n"
                + " Contacto = " + idContacto ;
    }

}

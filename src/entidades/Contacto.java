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
public class Contacto {

    private int idContacto;
    private String apellido;
    private String nombre;
    private String telefono;
    private String parentesco;

    public Contacto() {
    }

    public Contacto(String apellido, String nombre, String telefono, String parentesco) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.parentesco = parentesco;
    }

    public Contacto(int idContacto, String apellido, String nombre, String telefono, String parentesco) {
        this.idContacto = idContacto;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.parentesco = parentesco;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return  apellido + ", " + nombre + 
                ", telefono=" + telefono + 
                ", parentesco=" + parentesco;
    }

}

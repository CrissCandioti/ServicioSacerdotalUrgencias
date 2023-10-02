/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author criss
 */
public class Sacerdote {

    private int idSacerdote;
    private String dni;
    private String apellido;
    private String nombre;
    private String telefono;
    private LocalDate fechaNacimiento;
    private boolean estado;

    public Sacerdote() {
    }

    public Sacerdote(int idSacerdote, String dni, String apellido, String nombre, String telefono, LocalDate fechaNacimiento, boolean estado) {
        this.idSacerdote = idSacerdote;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Sacerdote(String dni, String apellido, String nombre, String telefono, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdSacerdote() {
        return idSacerdote;
    }

    public void setIdSacerdote(int idSacerdote) {
        this.idSacerdote = idSacerdote;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sacerdote{" + "idSacerdote=" + idSacerdote + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + '}';
    }

}

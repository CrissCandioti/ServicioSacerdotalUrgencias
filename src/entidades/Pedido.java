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
public class Pedido {

    private int idPedido;
    private LocalDate fechaPedido;
    private Guardia idGuardia;
    private Enfermo idEnfermo;

    public Pedido() {
    }

    public Pedido(LocalDate fechaPedido, Guardia idGuardia, Enfermo idEnfermo) {
        this.fechaPedido = fechaPedido;
        this.idGuardia = idGuardia;
        this.idEnfermo = idEnfermo;
    }

    public Pedido(int idPedido, LocalDate fechaPedido, Guardia idGuardia, Enfermo idEnfermo) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.idGuardia = idGuardia;
        this.idEnfermo = idEnfermo;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Guardia getIdGuardia() {
        return idGuardia;
    }

    public void setIdGuardia(Guardia idGuardia) {
        this.idGuardia = idGuardia;
    }

    public Enfermo getIdEnfermo() {
        return idEnfermo;
    }

    public void setIdEnfermo(Enfermo idEnfermo) {
        this.idEnfermo = idEnfermo;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", idGuardia=" + idGuardia + ", idEnfermo=" + idEnfermo + '}';
    }

}

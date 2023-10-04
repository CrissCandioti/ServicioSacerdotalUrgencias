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
public class Guardia {

    private int idGuardia;
    private LocalDate fecha;
    private Guardian idVocal;
    private Guardian idTelefonista;
    private Guardian idChofer;
    private Guardian idAcompañante;
    private Sacerdote idSacerdote;
    private Pedido idPedido;

    public Guardia() {
    }

    public Guardia(LocalDate fecha, Guardian idVocal, Guardian idTelefonista, Guardian idChofer, Guardian idAcompañante, Sacerdote idSacerdote, Pedido idPedido) {
        this.fecha = fecha;
        this.idVocal = idVocal;
        this.idTelefonista = idTelefonista;
        this.idChofer = idChofer;
        this.idAcompañante = idAcompañante;
        this.idSacerdote = idSacerdote;
        this.idPedido = idPedido;
    }

    public Guardia(int idGuardia, LocalDate fecha, Guardian idVocal, Guardian idTelefonista, Guardian idChofer, Guardian idAcompañante, Sacerdote idSacerdote, Pedido idPedido) {
        this.idGuardia = idGuardia;
        this.fecha = fecha;
        this.idVocal = idVocal;
        this.idTelefonista = idTelefonista;
        this.idChofer = idChofer;
        this.idAcompañante = idAcompañante;
        this.idSacerdote = idSacerdote;
        this.idPedido = idPedido;
    }

    public int getIdGuardia() {
        return idGuardia;
    }

    public void setIdGuardia(int idGuardia) {
        this.idGuardia = idGuardia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Guardian getIdVocal() {
        return idVocal;
    }

    public void setIdVocal(Guardian idVocal) {
        this.idVocal = idVocal;
    }

    public Guardian getIdTelefonista() {
        return idTelefonista;
    }

    public void setIdTelefonista(Guardian idTelefonista) {
        this.idTelefonista = idTelefonista;
    }

    public Guardian getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(Guardian idChofer) {
        this.idChofer = idChofer;
    }

    public Guardian getIdAcompañante() {
        return idAcompañante;
    }

    public void setIdAcompañante(Guardian idAcompañante) {
        this.idAcompañante = idAcompañante;
    }

    public Sacerdote getIdSacerdote() {
        return idSacerdote;
    }

    public void setIdSacerdote(Sacerdote idSacerdote) {
        this.idSacerdote = idSacerdote;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "Guardia{" + "idGuardia=" + idGuardia + ", fecha=" + fecha + ", idVocal=" + idVocal + ", idTelefonista=" + idTelefonista + ", idChofer=" + idChofer + ", idAcompa\u00f1ante=" + idAcompañante + ", idSacerdote=" + idSacerdote + ", idPedido=" + idPedido + '}';
    }

}

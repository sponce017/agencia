package com.agencia.modelos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "reservacion",schema="public")
public class Reservacion {
    private int idReservacion;
    private String categoria;
    private Integer numeroAsiento;
    private Date horaGestion;
    private String descripcionReserva;
    private Integer idPasajero;
    private Integer idVuelo;
    private Integer idEmpleadoGestion;
    private Integer idHotel;

    @Id
    @Column(name = "id")
    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    @Basic
    @Column(name = "categoria")
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Basic
    @Column(name = "numeroasiento")
    public Integer getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(Integer numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Basic
    @Column(name = "horagestion")
    public Date getHoraGestion() {
        return horaGestion;
    }

    public void setHoraGestion(Date horaGestion) {
        this.horaGestion = horaGestion;
    }

    @Basic
    @Column(name = "descripcionreserva")
    public String getDescripcionReserva() {
        return descripcionReserva;
    }

    public void setDescripcionReserva(String descripcionReserva) {
        this.descripcionReserva = descripcionReserva;
    }

    @Basic
    @Column(name = "idpasajero")
    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    @Basic
    @Column(name = "idvuelo")
    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    @Basic
    @Column(name = "idempleadogestion")
    public Integer getIdEmpleadoGestion() {
        return idEmpleadoGestion;
    }

    public void setIdEmpleadoGestion(Integer idEmpleadoGestion) {
        this.idEmpleadoGestion = idEmpleadoGestion;
    }

    @Basic
    @Column(name = "idhotel")
    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservacion that = (Reservacion) o;
        return idReservacion == that.idReservacion &&
                Objects.equals(categoria, that.categoria) &&
                Objects.equals(numeroAsiento, that.numeroAsiento) &&
                Objects.equals(horaGestion, that.horaGestion) &&
                Objects.equals(descripcionReserva, that.descripcionReserva) &&
                Objects.equals(idPasajero, that.idPasajero) &&
                Objects.equals(idVuelo, that.idVuelo) &&
                Objects.equals(idEmpleadoGestion, that.idEmpleadoGestion) &&
                Objects.equals(idHotel, that.idHotel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReservacion, categoria, numeroAsiento, horaGestion, descripcionReserva, idPasajero, idVuelo, idEmpleadoGestion, idHotel);
    }
}

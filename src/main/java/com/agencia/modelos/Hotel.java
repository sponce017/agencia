package com.agencia.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel",schema="public")
public class Hotel {
    private int idHotel;
    private String pais;
    private String ciudad;
    private String direccion;
    private String calificacion;

    @Id
    @Column(name = "id")
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    @Basic
    @Column(name = "pais")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Basic
    @Column(name = "ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "calificacion")
    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return idHotel == hotel.idHotel &&
                Objects.equals(pais, hotel.pais) &&
                Objects.equals(ciudad, hotel.ciudad) &&
                Objects.equals(direccion, hotel.direccion) &&
                Objects.equals(calificacion, hotel.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, pais, ciudad, direccion, calificacion);
    }
}

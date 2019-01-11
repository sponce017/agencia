package com.agencia.modelos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "cliente",schema="public")
public class Cliente {
    private int idPasajero;
    private String nombre;
    private Date fechaNacimiento;
    private String numeroDocumento;
    private String ciudad;
    private String direccion;
    private String telefono;

    @Id
    @Column(name = "id")
    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "fechanacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "numerodocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idPasajero == cliente.idPasajero &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(fechaNacimiento, cliente.fechaNacimiento) &&
                Objects.equals(numeroDocumento, cliente.numeroDocumento) &&
                Objects.equals(ciudad, cliente.ciudad) &&
                Objects.equals(direccion, cliente.direccion) &&
                Objects.equals(telefono, cliente.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPasajero, nombre, fechaNacimiento, numeroDocumento, ciudad, direccion, telefono);
    }
}

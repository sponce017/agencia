package com.agencia.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empleado",schema="public")
public class Empleado {
    private int idEmpleado;
    private String nombre;

    @Id
    @Column(name = "id")
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return idEmpleado == empleado.idEmpleado &&
                Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, nombre);
    }
}

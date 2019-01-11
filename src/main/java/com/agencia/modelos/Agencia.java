package com.agencia.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "agencia",schema="public")
public class Agencia {
    private int idAgencia;
    private String nombreAgencia;

    @Id
    @Column(name = "id")
    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return idAgencia == agencia.idAgencia &&
                Objects.equals(nombreAgencia, agencia.nombreAgencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAgencia, nombreAgencia);
    }
}

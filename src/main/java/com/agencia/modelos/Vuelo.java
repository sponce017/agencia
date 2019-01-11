package com.agencia.modelos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "vuelo",schema="public")
public class Vuelo {
    private int idVuelo;
    private String aerolinea;
    private String destino;
    private Date horaSalida;
    private Date horaLlegada;

    @Id
    @Column(name = "id")
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    @Basic
    @Column(name = "aerolinea")
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Basic
    @Column(name = "destino")
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Basic
    @Column(name = "horasalida")
    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Basic
    @Column(name = "horallegada")
    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return idVuelo == vuelo.idVuelo &&
                Objects.equals(aerolinea, vuelo.aerolinea) &&
                Objects.equals(destino, vuelo.destino) &&
                Objects.equals(horaSalida, vuelo.horaSalida) &&
                Objects.equals(horaLlegada, vuelo.horaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVuelo, aerolinea, destino, horaSalida, horaLlegada);
    }
}

package com.agencia.modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vuelo",schema="public")
public class Vuelo {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_vuelo")
	private Long idVuelo;
	
	@Column(name="avion")
    private String aerolinea;
    
	private String destino;
	
	private int capacidad;
	
	@Column(name="capacidad_actual")
	private int capacidadActual;
    
	@Column(name="hora_salida")
	@Temporal(TemporalType.DATE)
    private Date horaSalida;
    
	@Column(name="hora_llegada")
    @Temporal(TemporalType.DATE)
	private Date horaLlegada;
	
	@Column(name="hora_llegada_real")
	@Temporal(TemporalType.TIME)
	private Date horaLlegadaReal;

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Date getHoraLlegadaReal() {
		return horaLlegadaReal;
	}

	public void setHoraLlegadaReal(Date horaLlegadaReal) {
		this.horaLlegadaReal = horaLlegadaReal;
	}   
}

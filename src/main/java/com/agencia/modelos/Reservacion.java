package com.agencia.modelos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "reservacion",schema="public")
public class Reservacion {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_reservacion")
	private Long idReservacion;
    	
	private String categoria;
    
	@Column(name="numero_asiento")
	private int numeroAsiento;
    
	@Column(name="hora_gestion")
	private Date horaGestion;
    
	@Column(name="descripcion_reserva")
	private String descripcionReserva;
    
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_pasajero")
	private Pasajero pasajero;
    
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_vuelo")
	private Vuelo vuelo;
    
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_empleado_gestion")
	private Empleado empleado;
    
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_hotel")
	private Hotel hotel;

	public Long getIdReservacion() {
		return idReservacion;
	}

	public void setIdReservacion(Long idReservacion) {
		this.idReservacion = idReservacion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public Date getHoraGestion() {
		return horaGestion;
	}

	public void setHoraGestion(Date horaGestion) {
		this.horaGestion = horaGestion;
	}

	public String getDescripcionReserva() {
		return descripcionReserva;
	}

	public void setDescripcionReserva(String descripcionReserva) {
		this.descripcionReserva = descripcionReserva;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}

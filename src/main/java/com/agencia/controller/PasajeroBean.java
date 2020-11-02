package com.agencia.controller;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import com.agencia.dao.PasajeroDAO;
import com.agencia.modelos.Pasajero;

@Named
public class PasajeroBean {
	
	PasajeroDAO pasajeroDAO;
	Pasajero pasajero;
	
	@PostConstruct
	public void init() {
		pasajero = new Pasajero();		
	}
	
	public String agregarPasajero() {
		pasajeroDAO = new PasajeroDAO();
		pasajeroDAO.crearPasajero(pasajero);	
		return "index";
	}	

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
}

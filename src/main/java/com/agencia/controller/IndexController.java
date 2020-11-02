package com.agencia.controller;


import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named
public class IndexController {


    @PostConstruct
    public void init(){

    }
    
    public String agregarPasajeroForm() {
		return "agregarPasajero";
	}

    public String cliente (){
        return "clientes";
    }

    public String reservaciones(){
        return "reservaciones";
    }

    public String crearReservacion(){
        return "crearReservacion";
    }
}

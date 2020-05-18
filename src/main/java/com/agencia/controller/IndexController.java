package com.agencia.controller;


import com.agencia.dao.AgenciaDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
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

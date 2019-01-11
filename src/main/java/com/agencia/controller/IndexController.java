package com.agencia.controller;


import com.agencia.dao.AgenciaDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexController {


    @PostConstruct
    public void init(){

    }

    public String cliente (){
        return "clientes";
    }

    public String reservaciones(){
        AgenciaDAO.createAGencia(1,"Agencia de El Salvador");
        return "reservaciones";
    }

    public String crearReservacion(){
        return "crearReservacion";
    }
}

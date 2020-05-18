package com.agencia.controller;

import com.agencia.dao.AgenciaDAO;
import com.agencia.dao.ReservacionDAO;
import com.agencia.modelos.Reservacion;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class ReservacionesBean{

    private List<Reservacion> listaReservaciones;
    ReservacionDAO rsd;
    Reservacion reservacion;

    String editReservacionId;

    @PostConstruct
    public void init() {
        this.reservacion = new Reservacion();
        this.listaReservaciones = rsd.findAll();
    }

    public String crearReservacion(){
        rsd.crearReservacion(reservacion);
        init();
        return "reservaciones";
    }

    public String editarReservacionById(){
        editReservacionId = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("editReservacionId");
        return "editarReservacion";
    }

    public List<Reservacion> getListaReservaciones() {
        return listaReservaciones;
    }

    public void setListaReservaciones(List<Reservacion> listaReservaciones) {
        this.listaReservaciones = listaReservaciones;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public String getEditReservacionId() {
        return editReservacionId;
    }

    public void setEditReservacionId(String editReservacionId) {
        this.editReservacionId = editReservacionId;
    }
}

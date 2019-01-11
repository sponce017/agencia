package com.agencia.dao;

import com.agencia.modelos.Agencia;
import com.agencia.modelos.Reservacion;

import javax.persistence.*;
import java.util.List;

public class ReservacionDAO {

    private static final String PERSISTENCE_UNIT_NAME = "AgenciaPersistenceUnit";
    private static EntityManagerFactory factory;



    // Method To Add Create School Details In The Database
    public static List<Reservacion> findAll() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        Query q = em.createQuery("select t from Reservacion t");

        List<Reservacion> lse = q.getResultList();

        return lse;
    }

    public static void crearReservacion(Reservacion reservacion){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(reservacion);
        em.getTransaction().commit();

    }

    public static void editarReservacion(Reservacion reservacion){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.merge(reservacion);
        em.getTransaction().commit();

    }

    public static void eliminarReservacion(Reservacion reservacion){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.merge(reservacion);
        em.getTransaction().commit();

    }

}

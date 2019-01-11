package com.agencia.dao;

import com.agencia.modelos.Agencia;

import javax.persistence.*;
import java.util.List;

public class AgenciaDAO {

    private static final String PERSISTENCE_UNIT_NAME = "AgenciaPersistenceUnit";
    private static EntityManagerFactory factory;



    // Method To Add Create School Details In The Database
    public static void createAGencia(int id, String name) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        Query q = em.createQuery("select t from Agencia t");

        List<Agencia> lse = q.getResultList();

        for (Agencia agencia:lse){
            System.out.println(agencia.getNombreAgencia());
        }
    }

}

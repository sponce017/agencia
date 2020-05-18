package com.agencia.dao;

import com.agencia.modelos.Agencia;

import javax.persistence.*;
import java.util.List;

public class AgenciaDAO {

    private static final String PERSISTENCE_UNIT_NAME = "AgenciaPersistenceUnit";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    
    public void createAgencia(Agencia agencia) {
    	EntityManager em = emf.createEntityManager();
    }

}

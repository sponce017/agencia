package com.agencia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.agencia.modelos.Pasajero;
import com.agencia.modelos.Reservacion;

public class PasajeroDAO {
	
	private static final String PERSISTENCE_UNIT_NAME = "AgenciaPersistenceUnit";
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public static List<Pasajero> findAll() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from pasajero p");
		List<Pasajero> lse = q.getResultList();
		return lse;
	}

	public void crearPasajero(Pasajero pasajero) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(pasajero);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void editarPasajero(Pasajero pasajero) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(pasajero);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void eliminarPasajero(Pasajero pasajero) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.getTransaction().begin();
			em.merge(pasajero);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.close();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}

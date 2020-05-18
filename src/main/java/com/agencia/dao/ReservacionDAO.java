package com.agencia.dao;

import com.agencia.modelos.Reservacion;

import javax.persistence.*;
import java.util.List;

public class ReservacionDAO {

	private static final String PERSISTENCE_UNIT_NAME = "AgenciaPersistenceUnit";
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public static List<Reservacion> findAll() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select t from Reservacion t");
		List<Reservacion> lse = q.getResultList();
		return lse;
	}

	public void crearReservacion(Reservacion reservacion) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(reservacion);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void editarReservacion(Reservacion reservacion) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(reservacion);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void eliminarReservacion(Reservacion reservacion) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.getTransaction().begin();
			em.merge(reservacion);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.close();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}
}

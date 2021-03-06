package com.agencia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agencia.modelos.Reservacion;

@Repository
public interface ReservacionRepository extends CrudRepository<Reservacion, Long>{

}

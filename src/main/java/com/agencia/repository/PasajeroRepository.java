package com.agencia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agencia.modelos.Pasajero;

@Repository
public interface PasajeroRepository extends CrudRepository<Pasajero, Long>{

}

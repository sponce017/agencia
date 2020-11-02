package com.agencia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agencia.modelos.Vuelo;

@Repository
public interface VueloRepository extends CrudRepository<Vuelo, Long>{

}

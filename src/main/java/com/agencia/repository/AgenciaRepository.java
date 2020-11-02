package com.agencia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agencia.modelos.Agencia;

@Repository
public interface AgenciaRepository extends CrudRepository<Agencia, Long>{

}

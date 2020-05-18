package com.agencia.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia", schema = "public")
public class Agencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_agencia")
	private Long idAgencia;

	@Column(name = "nombre")
	private String nombreAgencia;

	public Long getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Long idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getNombreAgencia() {
		return nombreAgencia;
	}

	public void setNombreAgencia(String nombreAgencia) {
		this.nombreAgencia = nombreAgencia;
	}

}

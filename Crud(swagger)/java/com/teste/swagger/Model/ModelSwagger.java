package com.teste.swagger.Model;

import java.util.UUID;



import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "julio")
public class ModelSwagger {
	
	@Id
	private UUID id;
	private String nome;
	
	public ModelSwagger() {
    this.id = UUID.randomUUID();
		
	}
		
	public UUID getId() {
		return id;
	}
	
	  public void setId(UUID id) {
	        this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
	
}

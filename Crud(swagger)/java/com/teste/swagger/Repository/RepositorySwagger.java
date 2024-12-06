package com.teste.swagger.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.swagger.Model.ModelSwagger;

public interface RepositorySwagger extends JpaRepository<ModelSwagger, UUID>{

	

}

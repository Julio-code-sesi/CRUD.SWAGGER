package com.teste.swagger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.swagger.DTO.DTOSwagger;
import com.teste.swagger.Model.ModelSwagger;
import com.teste.swagger.Repository.RepositorySwagger;


@RestController
@RequestMapping("/api/swagger")
public class ControllerSwagger {

	@Autowired
	RepositorySwagger repository;
	
	@PostMapping
	public ResponseEntity<ModelSwagger> create(@RequestBody ModelSwagger swagger) {
	ModelSwagger savedSwagger = repository.save(swagger);
	return ResponseEntity.ok(savedSwagger);
	}}
	



package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.repo.IPersonaRepo;

@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaRepo repo; // = new PersonaRepoImpl();
	
	@GetMapping
	public void saludar() {
		repo.saludar();		
	}
}

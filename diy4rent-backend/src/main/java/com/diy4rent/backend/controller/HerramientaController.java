package com.diy4rent.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diy4rent.backend.model.Herramienta;
import com.diy4rent.backend.repository.HerramientaRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class HerramientaController {

	@Autowired
	private HerramientaRepository herramientaRepository;
	
	@GetMapping("herramientas")
	public List<Herramienta> getHerramientas(){
		return this.herramientaRepository.findAll();
	}
	
}

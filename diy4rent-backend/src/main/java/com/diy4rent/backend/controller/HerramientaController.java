package com.diy4rent.backend.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("herramientas")
	public ResponseEntity<Herramienta> create(@RequestBody Herramienta newHerramienta) throws URISyntaxException{
		Herramienta result = herramientaRepository.save(newHerramienta);
		return ResponseEntity.ok(result);
	}
	
	@PutMapping("herramientas/{id}")
	public ResponseEntity<Herramienta> update(@RequestBody Herramienta newHerramienta, @PathVariable long id){
		return herramientaRepository.findById(id).map(herramienta -> {
			herramienta.setNombre(newHerramienta.getNombre());
			herramienta.setCategoria(newHerramienta.getCategoria());
			herramienta.setPrecio(newHerramienta.getPrecio());
			herramienta.setEstadoDesgaste(newHerramienta.getEstadoDesgaste());
			herramienta.setDescripcion(newHerramienta.getDescripcion());
			herramienta.setUserId(newHerramienta.getUserId());
			herramienta.setFoto(newHerramienta.getFoto());
			herramientaRepository.save(herramienta);
			return ResponseEntity.ok().body(herramienta);
		}).orElse(new ResponseEntity<Herramienta>(HttpStatus.NOT_FOUND));
	}
	
	@DeleteMapping("herramientas/{id}")
	public ResponseEntity<Herramienta> delete(@PathVariable long id){
		herramientaRepository.deleteById(id);
		return ResponseEntity.ok().body(null);
	}
	
}

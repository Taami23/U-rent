package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arrendatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.ArrendatarioService;

@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Arrendatario")
public class ArrendatarioController {

	
	@Autowired
	private ArrendatarioService Arrendatario;

	@GetMapping
	public List<Arrendatario> listar(){
		return Arrendatario.getAll();
	}

	@PostMapping
	public Arrendatario agregar(@RequestBody Arrendatario i){
		return Arrendatario.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Arrendatario> listarId(@PathVariable(value = "id") int id){
		return  Arrendatario.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Arrendatario editar(@RequestBody Arrendatario i, @PathVariable(value = "id") int id){
		i.setId_Arrendatario(id);
		return Arrendatario.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Arrendatario delete(@PathVariable(value = "id") int id){
		return Arrendatario.delete(id);
	}
	
}

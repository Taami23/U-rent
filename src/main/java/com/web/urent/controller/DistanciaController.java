package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Distancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.DistanciaService;


@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Distancia")
public class DistanciaController {

	@Autowired
	private DistanciaService Distancia;

	@GetMapping
	public List<Distancia> listar(){
		return Distancia.getAll();
	}

	@PostMapping
	public Distancia agregar(@RequestBody Distancia i){
		return Distancia.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Distancia> listarId(@PathVariable(value = "id") int id){
		return  Distancia.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Distancia editar(@RequestBody Distancia i, @PathVariable(value = "id") int id){
		i.setIdDistancia(id);
		return Distancia.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Distancia delete(@PathVariable(value = "id") int id){
		return Distancia.delete(id);
	}
}

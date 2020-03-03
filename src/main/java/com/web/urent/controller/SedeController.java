package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.SedeService;


@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Sede")
public class SedeController {

	@Autowired
	private SedeService Sede;

	@GetMapping
	public List<Sede> listar(){
		return Sede.getAll();
	}

	@PostMapping
	public Sede agregar(@RequestBody Sede i){
		return Sede.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Sede> listarId(@PathVariable(value = "id") int id){
		return  Sede.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Sede editar(@RequestBody Sede i, @PathVariable(value = "id") int id){
		i.setIdSede(id);
		return Sede.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Sede delete(@PathVariable(value = "id") int id){
		return Sede.delete(id);
	}
}

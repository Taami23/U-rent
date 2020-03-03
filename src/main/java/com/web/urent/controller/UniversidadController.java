package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.UniversidadService;


@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Universidad")
public class UniversidadController {

	@Autowired
	private UniversidadService Universidad;

	@GetMapping
	public List<Universidad> listar(){
		return Universidad.getAll();
	}

	@PostMapping
	public Universidad agregar(@RequestBody Universidad i){
		return Universidad.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Universidad> listarId(@PathVariable(value = "id") int id){
		return  Universidad.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Universidad editar(@RequestBody Universidad i, @PathVariable(value = "id") int id){
		i.setIdUniversidad(id);
		return Universidad.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Universidad delete(@PathVariable(value = "id") int id){
		return Universidad.delete(id);
	}
}

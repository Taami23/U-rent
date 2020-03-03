package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.PropiedadService;


@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Propiedad")
public class PropiedadController {

	@Autowired
	private PropiedadService Propiedad;

	@GetMapping
	public List<Propiedad> listar(){
		return Propiedad.getAll();
	}

	@PostMapping
	public Propiedad agregar(@RequestBody Propiedad i){
		return Propiedad.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Propiedad> listarId(@PathVariable(value = "id") int id){
		return  Propiedad.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Propiedad editar(@RequestBody Propiedad i, @PathVariable(value = "id") int id){
		i.setId_Propiedad(id);
		return Propiedad.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Propiedad delete(@PathVariable(value = "id") int id){
		return Propiedad.delete(id);
	}
}

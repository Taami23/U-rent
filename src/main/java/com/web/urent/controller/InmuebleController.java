package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arriendo;
import com.web.urent.model.Inmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.InmuebleService;


@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Inmueble")
public class InmuebleController {

	@Autowired
	private InmuebleService inmueble;

	@GetMapping
	public List<Inmueble> listar(){
		return inmueble.getAll();
	}

	@GetMapping(path = {"/Arrendador/{id}"})
	public List<Inmueble> listarArrendador(@PathVariable(value = "id") int id){return inmueble.getAllArrendador(id);
	}

	@PostMapping
	public Inmueble agregar(@RequestBody Inmueble i){
		return inmueble.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Inmueble> listarId(@PathVariable(value = "id") int id){
		return  inmueble.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Inmueble editar(@RequestBody Inmueble i, @PathVariable(value = "id") int id){
		i.setIdInmueble(id);
		return inmueble.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Inmueble delete(@PathVariable(value = "id") int id){
		return inmueble.delete(id);
	}
}

package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arrendador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.ArrendadorService;

@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping({"/Arrendador"})
public class ArrendadorController {

	@Autowired
	private ArrendadorService arrendador;
	
	@GetMapping
	public List<Arrendador> listar(){
		return arrendador.getAll();
	}

	@PostMapping
	public Arrendador agregar(@RequestBody Arrendador a){
		return arrendador.save(a);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Arrendador> listarId(@PathVariable(value = "id") int id){
		return arrendador.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Arrendador editar(@RequestBody Arrendador a, @PathVariable(value = "id") int id){
		a.setId_Arrendador(id);
		return arrendador.save(a);
	}

	@DeleteMapping(path = {"/{id}"})
	public Arrendador delete(@PathVariable(value = "id") int id){
		return arrendador.delete(id);
	}
}

package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arriendo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.ArriendoService;


@CrossOrigin(origins = "http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/Arriendo")
public class ArriendoController {

	@Autowired
	private ArriendoService Arriendo;

	@GetMapping
	public List<Arriendo> listar(){return Arriendo.getAll();
	}

	@GetMapping(path = {"/Arrendador/{id}"})
	public List<Arriendo> listarArrendador(@PathVariable(value = "id") int id){return Arriendo.getAllArrendador(id);
	}

	@GetMapping(path = {"/Arrendatario/{id}"})
	public List<Arriendo> listarArrendatario(@PathVariable(value = "id") int id){return Arriendo.getAllArrendatario(id);
	}

	@PostMapping
	public Arriendo agregar(@RequestBody Arriendo i){
		return Arriendo.save(i);
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Arriendo> listarId(@PathVariable(value = "id") int id){
		return  Arriendo.get(id);
	}

	@PutMapping(path = {"/{id}"})
	public Arriendo editar(@RequestBody Arriendo i, @PathVariable(value = "id") int id){
		i.setIdArriendo(id);
		return Arriendo.save(i);
	}

	@DeleteMapping(path = {"/{id}"})
	public Arriendo delete(@PathVariable(value = "id") int id){
		return Arriendo.delete(id);
	}
}

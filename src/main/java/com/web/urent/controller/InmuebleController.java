<<<<<<< HEAD
package com.web.urent.controller;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Inmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.urent.service.InmuebleService;

import javax.persistence.criteria.CriteriaBuilder;


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
=======
package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Inmueble;
import web.urent.service.InmuebleService;

@RequestMapping("/Inmueble")
@Controller

public class InmuebleController {

	@Autowired
	private InmuebleService inmueble;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", inmueble.getAll());
		return "indexInmueble";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Inmueble", inmueble.get(id));
		}else {
			model.addAttribute("Inmueble", new Inmueble());
		}
		return "saveInmueble";		
	}
	@PostMapping("/save")
	public String save(Model model, Inmueble admin) {
		inmueble.save(admin);
		return "redirect:/Inmueble/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		inmueble.delete(id);
		return "redirect:/Inmueble/";
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

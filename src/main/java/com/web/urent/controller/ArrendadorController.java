<<<<<<< HEAD
package com.web.urent.controller;

import java.awt.geom.Area;
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
=======
package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import web.urent.model.Arrendador;
import web.urent.service.ArrendadorService;

@RequestMapping("/Arrendador")
@Controller
public class ArrendadorController {

	@Autowired
	private ArrendadorService arrendador;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", arrendador.getAll());
		return "indexArrendador";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Arrendador", arrendador.get(id));
		}else {
			model.addAttribute("Arrendador", new Arrendador());
		}
		return "saveArrendador";		
	}
	@PostMapping("/save")
	public String save(Model model, Arrendador arrendador) {
		this.arrendador.save(arrendador);
		return "redirect:/Arrendador/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		arrendador.delete(id);
		return "redirect:/Arrendador/";
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

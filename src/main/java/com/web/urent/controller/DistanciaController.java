<<<<<<< HEAD
package com.web.urent.controller;

import com.web.urent.model.Distancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.urent.service.DistanciaService;

@RequestMapping("/Distancia")
@Controller
public class DistanciaController {

	@Autowired
	private DistanciaService distancia;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", distancia.getAll());
		return "indexDistancia";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Distancia", distancia.get(id));
		}else {
			model.addAttribute("Distancia", new Distancia());
		}
		return "saveDistancia";		
	}
	@PostMapping("/agregar")
	public String save(Model model, Distancia admin) {
		distancia.save(admin);
		return "redirect:/Distancia/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		distancia.delete(id);
		return "redirect:/Distancia/";
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

import web.urent.model.Distancia;
import web.urent.service.DistanciaService;

@RequestMapping("/Distancia")
@Controller
public class DistanciaController {

	@Autowired
	private DistanciaService distancia;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", distancia.getAll());
		return "indexDistancia";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Distancia", distancia.get(id));
		}else {
			model.addAttribute("Distancia", new Distancia());
		}
		return "saveDistancia";		
	}
	@PostMapping("/agregar")
	public String save(Model model, Distancia admin) {
		distancia.save(admin);
		return "redirect:/Distancia/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		distancia.delete(id);
		return "redirect:/Distancia/";
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

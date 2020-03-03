<<<<<<< HEAD
package com.web.urent.controller;

import com.web.urent.model.Arrendatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.urent.service.ArrendatarioService;

@RequestMapping("/Arrendatario")
@Controller
public class ArrendatarioController {

	@Autowired
	private ArrendatarioService arrendatario;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", arrendatario.getAll());
		return "indexArrendatario";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Arrendatario", arrendatario.get(id));
		}else {
			model.addAttribute("Arrendatario", new Arrendatario());
		}
		return "saveArrendatario";		
	}
	@PostMapping("/save")
	public String save(Model model, Arrendatario arren) {
		arrendatario.save(arren);
		return "redirect:/Arrendatario/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		arrendatario.delete(id);
		return "redirect:/Arrendatario/";
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

import web.urent.model.Arrendatario;
import web.urent.service.ArrendatarioService;

@RequestMapping("/Arrendatario")
@Controller
public class ArrendatarioController {

	@Autowired
	private ArrendatarioService arrendatario;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", arrendatario.getAll());
		return "indexArrendatario";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Arrendatario", arrendatario.get(id));
		}else {
			model.addAttribute("Arrendatario", new Arrendatario());
		}
		return "saveArrendatario";		
	}
	@PostMapping("/save")
	public String save(Model model, Arrendatario arren) {
		arrendatario.save(arren);
		return "redirect:/Arrendatario/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		arrendatario.delete(id);
		return "redirect:/Arrendatario/";
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

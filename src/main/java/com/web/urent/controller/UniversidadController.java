<<<<<<< HEAD
package com.web.urent.controller;

import com.web.urent.model.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.urent.service.UniversidadService;


@RequestMapping("/Universidad")
@Controller
public class UniversidadController {
	@Autowired
	private UniversidadService universidad;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", universidad.getAll());
		return "indexUniversidad";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Universidad", universidad.get(id));
		}else {
			model.addAttribute("Universidad", new Universidad());
		}
		return "saveUniversidad";		
	}
	@PostMapping("/save")
	public String save(Model model, Universidad admin) {
		universidad.save(admin);
		return "redirect:/Universidad/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		universidad.delete(id);
		return "redirect:/Universidad/";
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

import web.urent.model.Universidad;
import web.urent.service.UniversidadService;


@RequestMapping("/Universidad")
@Controller
public class UniversidadController {
	@Autowired
	private UniversidadService universidad;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", universidad.getAll());
		return "indexUniversidad";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Universidad", universidad.get(id));
		}else {
			model.addAttribute("Universidad", new Universidad());
		}
		return "saveUniversidad";		
	}
	@PostMapping("/save")
	public String save(Model model, Universidad admin) {
		universidad.save(admin);
		return "redirect:/Universidad/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		universidad.delete(id);
		return "redirect:/Universidad/";
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

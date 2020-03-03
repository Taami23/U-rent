<<<<<<< HEAD
package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arrendador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.web.urent.repository.ArrendadorRepository;

@Service
public class ArrendadorServiceImpl implements ArrendadorService{

	@Autowired
	private ArrendadorRepository arrendadorRepositorio;
	@Override
	public List<Arrendador> getAll() {
		return arrendadorRepositorio.listar();
	}

	@Override
	public Arrendador save(Arrendador arrendador) {
		return arrendadorRepositorio.save(arrendador);
	}

	@Override
	public Optional<Arrendador> get(int id) {
		return arrendadorRepositorio.findById(id);
	}

	@Override
	public Arrendador delete(int id) {
		Optional<Arrendador> a = arrendadorRepositorio.findById(id);
		Arrendador arrendador = a.get();
		arrendador.setEstado(0);
		arrendadorRepositorio.save(arrendador);
		return arrendador;
	}

}
=======
package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import web.urent.model.Arrendador;
import web.urent.repository.ArrendadorRepository;

@Service
public class ArrendadorServiceImpl implements ArrendadorService{

	@Autowired
	private ArrendadorRepository arrendadorRepositorio;
	@Override
	public List<Arrendador> getAll() {	
		return arrendadorRepositorio.listar();
	}

	@Override
	public void save(Arrendador arrendador) {
		arrendadorRepositorio.save(arrendador);		
	}

	@Override
	public Arrendador get(int id) {
		return arrendadorRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Arrendador arrendador = arrendadorRepositorio.getOne(id);
		arrendador.setEstado(0);
		arrendadorRepositorio.save(arrendador);			
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

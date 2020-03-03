<<<<<<< HEAD
package com.web.urent.service;

import java.util.List;

import com.web.urent.model.Arrendatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.ArrendatarioRepository;
@Service
public class ArrendatarioServiceImpl implements ArrendatarioService{

	@Autowired
	private ArrendatarioRepository arrendatarioRepositorio;
	
	@Override
	public List<Arrendatario> getAll() {
		return arrendatarioRepositorio.findAll();
	}

	@Override
	public void save(Arrendatario arrendatario) {
		arrendatarioRepositorio.save(arrendatario);
	}

	@Override
	public Arrendatario get(int id) {
		return arrendatarioRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Arrendatario arren= arrendatarioRepositorio.getOne(id);
		arren.setEstado((byte)(0));
		arrendatarioRepositorio.save(arren);
		
	}

}
=======
package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.model.Arrendatario;
import web.urent.repository.ArrendatarioRepository;
@Service
public class ArrendatarioServiceImpl implements ArrendatarioService{

	@Autowired
	private ArrendatarioRepository arrendatarioRepositorio;
	
	@Override
	public List<Arrendatario> getAll() {
		return arrendatarioRepositorio.findAll();
	}

	@Override
	public void save(Arrendatario arrendatario) {
		arrendatarioRepositorio.save(arrendatario);
	}

	@Override
	public Arrendatario get(int id) {
		return arrendatarioRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Arrendatario arren= arrendatarioRepositorio.getOne(id);
		arren.setEstado((byte)(0));
		arrendatarioRepositorio.save(arren);
		
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

<<<<<<< HEAD
package com.web.urent.service;

import java.util.List;

import com.web.urent.model.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.PropiedadRepository;
@Service
public class PropiedadServiceImpl implements PropiedadService {

	@Autowired
	private PropiedadRepository propiedadRepositorio;
	@Override
	public List<Propiedad> getAll() {
		return propiedadRepositorio.findAll();
	}

	@Override
	public void save(Propiedad propiedad) {
		propiedadRepositorio.save(propiedad);
	}

	@Override
	public Propiedad get(int id) {
		return propiedadRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Propiedad prop= propiedadRepositorio.getOne(id);
		prop.setEstado((0));
		propiedadRepositorio.save(prop);
		
	}
}
=======
package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.model.Propiedades;
import web.urent.repository.PropiedadRepository;
@Service
public class PropiedadServiceImpl implements PropiedadService {

	@Autowired
	private PropiedadRepository propiedadRepositorio;
	@Override
	public List<Propiedades> getAll() {
		return propiedadRepositorio.findAll();
	}

	@Override
	public void save(Propiedades propiedad) {
		propiedadRepositorio.save(propiedad);
	}

	@Override
	public Propiedades get(int id) {
		return propiedadRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Propiedades prop= propiedadRepositorio.getOne(id);
		prop.setEstado((byte)(0));
		propiedadRepositorio.save(prop);
		
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

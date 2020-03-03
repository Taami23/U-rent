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

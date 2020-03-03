package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.PropiedadRepository;

@Service
public class PropiedadServiceImpl implements PropiedadService {

	@Autowired
	private PropiedadRepository PropiedadRepositorio;

	@Override
	public List<Propiedad> getAll() {
		return PropiedadRepositorio.listar();
	}

	@Override
	public Propiedad save(Propiedad Propiedad) { return PropiedadRepositorio.save(Propiedad); }

	@Override
	public Optional<Propiedad> get(int id) {
		return PropiedadRepositorio.findById(id);
	}

	@Override
	public Propiedad delete(int id) {
		Optional<Propiedad> op = PropiedadRepositorio.findById(id);
		Propiedad inm = op.get();
		inm.setEstado(0);
		PropiedadRepositorio.save(inm);
		return inm;
	}
}

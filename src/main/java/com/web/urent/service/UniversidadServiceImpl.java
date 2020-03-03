package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {

	@Autowired
	private UniversidadRepository UniversidadRepositorio;

	@Override
	public List<Universidad> getAll() {
		return UniversidadRepositorio.listar();
	}

	@Override
	public Universidad save(Universidad Universidad) { return UniversidadRepositorio.save(Universidad); }

	@Override
	public Optional<Universidad> get(int id) {
		return UniversidadRepositorio.findById(id);
	}

	@Override
	public Universidad delete(int id) {
		Optional<Universidad> op = UniversidadRepositorio.findById(id);
		Universidad inm = op.get();
		inm.setEstado(0);
		UniversidadRepositorio.save(inm);
		return inm;
	}
}

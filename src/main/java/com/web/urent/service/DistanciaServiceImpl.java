package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Distancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.DistanciaRepository;

@Service
public class DistanciaServiceImpl implements DistanciaService {

	@Autowired
	private DistanciaRepository DistanciaRepositorio;

	@Override
	public List<Distancia> getAll() {
		return DistanciaRepositorio.listar();
	}

	@Override
	public Distancia save(Distancia Distancia) { return DistanciaRepositorio.save(Distancia); }

	@Override
	public Optional<Distancia> get(int id) {
		return DistanciaRepositorio.findById(id);
	}

	@Override
	public Distancia delete(int id) {
		Optional<Distancia> op = DistanciaRepositorio.findById(id);
		Distancia inm = op.get();
		inm.setEstado(0);
		DistanciaRepositorio.save(inm);
		return inm;
	}
}

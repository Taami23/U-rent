package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arrendador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.ArrendadorRepository;

@Service
public class ArrendadorServiceImpl implements ArrendadorService {

	@Autowired
	private ArrendadorRepository ArrendadorRepositorio;

	@Override
	public List<Arrendador> getAll() {
		return ArrendadorRepositorio.listar();
	}

	@Override
	public Arrendador save(Arrendador Arrendador) { return ArrendadorRepositorio.save(Arrendador); }

	@Override
	public Optional<Arrendador> get(int id) {
		return ArrendadorRepositorio.findById(id);
	}

	@Override
	public Arrendador delete(int id) {
		Optional<Arrendador> op = ArrendadorRepositorio.findById(id);
		Arrendador inm = op.get();
		inm.setEstado(0);
		ArrendadorRepositorio.save(inm);
		return inm;
	}
}

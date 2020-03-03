package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.SedeRepository;

@Service
public class SedeServiceImpl implements SedeService {

	@Autowired
	private SedeRepository SedeRepositorio;

	@Override
	public List<Sede> getAll() {
		return SedeRepositorio.listar();
	}

	@Override
	public Sede save(Sede Sede) { return SedeRepositorio.save(Sede); }

	@Override
	public Optional<Sede> get(int id) {
		return SedeRepositorio.findById(id);
	}

	@Override
	public Sede delete(int id) {
		Optional<Sede> op = SedeRepositorio.findById(id);
		Sede inm = op.get();
		inm.setEstado(0);
		SedeRepositorio.save(inm);
		return inm;
	}
}

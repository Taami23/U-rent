package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arrendatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.ArrendatarioRepository;

@Service
public class ArrendatarioServiceImpl implements ArrendatarioService {

	@Autowired
	private ArrendatarioRepository ArrendatarioRepositorio;

	@Override
	public List<Arrendatario> getAll() {
		return ArrendatarioRepositorio.listar();
	}

	@Override
	public Arrendatario save(Arrendatario Arrendatario) { return ArrendatarioRepositorio.save(Arrendatario); }

	@Override
	public Optional<Arrendatario> get(int id) {
		return ArrendatarioRepositorio.findById(id);
	}

	@Override
	public Arrendatario delete(int id) {
		Optional<Arrendatario> op = ArrendatarioRepositorio.findById(id);
		Arrendatario inm = op.get();
		inm.setEstado(0);
		ArrendatarioRepositorio.save(inm);
		return inm;
	}
}

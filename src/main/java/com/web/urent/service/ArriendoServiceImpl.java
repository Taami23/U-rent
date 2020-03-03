package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Arriendo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.ArriendoRepository;

@Service
public class ArriendoServiceImpl implements ArriendoService {

	@Autowired
	private ArriendoRepository ArriendoRepositorio;

	@Override
	public List<Arriendo> getAll() {
		return ArriendoRepositorio.listar();
	}

	@Override
	public Arriendo save(Arriendo Arriendo) { return ArriendoRepositorio.save(Arriendo); }

	@Override
	public Optional<Arriendo> get(int id) {
		return ArriendoRepositorio.findById(id);
	}

	@Override
	public Arriendo delete(int id) {
		Optional<Arriendo> op = ArriendoRepositorio.findById(id);
		Arriendo inm = op.get();
		inm.setEstado(0);
		ArriendoRepositorio.save(inm);
		return inm;
	}
}

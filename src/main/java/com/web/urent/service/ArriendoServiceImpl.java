package com.web.urent.service;

import java.util.List;

import com.web.urent.model.Arriendo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.ArriendoRepository;

@Service
public class ArriendoServiceImpl implements ArriendoService {

	@Autowired
	private ArriendoRepository arriendoRepositorio;
	@Override
	public List<Arriendo> getAll() {
		return arriendoRepositorio.findAll();
	}

	@Override
	public void save(Arriendo arriendo) {
		arriendoRepositorio.save(arriendo);

	}

	@Override
	public Arriendo get(int id) {
		return arriendoRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Arriendo arri= arriendoRepositorio.getOne(id);
		arri.setEstado((0));
		arriendoRepositorio.save(arri);

	}
}

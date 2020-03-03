package com.web.urent.service;

import java.util.List;

import com.web.urent.model.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.UniversidadRepository;
@Service
public class UniversidadServiceImpl implements UniversidadService{

	@Autowired
	private UniversidadRepository universidadRepositorio;
	@Override
	public List<Universidad> getAll() {
		return universidadRepositorio.findAll();
	}

	@Override
	public void save(Universidad universidad) {
		universidadRepositorio.save(universidad);
	}

	@Override
	public Universidad get(int id) {
		return universidadRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Universidad uni= universidadRepositorio.getOne(id);
		uni.setEstado((0));
		universidadRepositorio.save(uni);
		
	}
}

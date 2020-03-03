<<<<<<< HEAD
package com.web.urent.service;

import java.util.List;
import java.util.Optional;

import com.web.urent.model.Inmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.urent.repository.InmuebleRepository;

@Service
public class InmuebleServiceImpl implements InmuebleService {

	@Autowired
	private InmuebleRepository inmuebleRepositorio;

	@Override
	public List<Inmueble> getAll() {
		return inmuebleRepositorio.listar();
	}

	@Override
	public Inmueble save(Inmueble inmueble) { return inmuebleRepositorio.save(inmueble); }

	@Override
	public Optional<Inmueble> get(int id) {
		return inmuebleRepositorio.findById(id);
	}

	@Override
	public Inmueble delete(int id) {
		Optional<Inmueble> op = inmuebleRepositorio.findById(id);
		Inmueble inm = op.get();
		inm.setEstado(0);
		inmuebleRepositorio.save(inm);
		return inm;
	}
}
=======
package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.repository.InmuebleRepository;
import web.urent.model.Inmueble;
@Service
public class InmuebleServiceImpl implements InmuebleService {

	@Autowired
	private InmuebleRepository inmuebleRepositorio;

	@Override
	public List<Inmueble> getAll() {
		return inmuebleRepositorio.listar();
	}

	@Override
	public void save(Inmueble inmueble) {
		inmuebleRepositorio.save(inmueble);
	}

	@Override
	public Inmueble get(int id) {
		return inmuebleRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Inmueble inm = inmuebleRepositorio.getOne(id);
		inm.setEstado(0);
		inmuebleRepositorio.save(inm);
		
	}
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

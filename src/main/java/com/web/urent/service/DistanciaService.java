package com.web.urent.service;

import com.web.urent.model.Distancia;

import java.util.List;
import java.util.Optional;

public interface DistanciaService {

	public List<Distancia> getAll();
	
	public Distancia save(Distancia Distancia);
	
	public Optional<Distancia> get(int id);
	
	public Distancia delete(int id);
}

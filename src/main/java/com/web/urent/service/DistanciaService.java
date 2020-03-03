package com.web.urent.service;

import com.web.urent.model.Distancia;

import java.util.List;

public interface DistanciaService {

	public List<Distancia> getAll();
	
	public void save(Distancia distancia);
	
	public Distancia get(int id);
	
	public void delete(int id);
	
}

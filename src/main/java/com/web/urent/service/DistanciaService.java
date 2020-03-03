<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Distancia;

import java.util.List;

public interface DistanciaService {

	public List<Distancia> getAll();
	
	public void save(Distancia distancia);
	
	public Distancia get(int id);
	
	public void delete(int id);
	
}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Distancia;

public interface DistanciaService {

	public List<Distancia> getAll();
	
	public void save(Distancia distancia);
	
	public Distancia get(int id);
	
	public void delete(int id);
	
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

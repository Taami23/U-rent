<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Arrendador;

import java.util.List;
import java.util.Optional;


public interface ArrendadorService {

	public List<Arrendador> getAll();
	
	public Arrendador save(Arrendador arrendador);
	
	public Optional<Arrendador> get(int id);
	
	public Arrendador delete(int id);
	
}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Arrendador;


public interface ArrendadorService {

	public List<Arrendador> getAll();
	
	public void save(Arrendador arrendador);
	
	public Arrendador get(int id);
	
	public void delete(int id);
	
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

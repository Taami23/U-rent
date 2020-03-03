<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Inmueble;

import java.util.List;
import java.util.Optional;

public interface InmuebleService {

	public List<Inmueble> getAll();
	
	public Inmueble save(Inmueble inmueble);
	
	public Optional<Inmueble> get(int id);
	
	public Inmueble delete(int id);
}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Inmueble;

public interface InmuebleService {

	public List<Inmueble> getAll();
	
	public void save(Inmueble inmueble);
	
	public Inmueble get(int id);
	
	public void delete(int id);
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

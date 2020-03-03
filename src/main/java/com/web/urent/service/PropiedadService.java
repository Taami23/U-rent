<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Propiedad;

import java.util.List;

public interface PropiedadService {

	public List<Propiedad> getAll();
	
	public void save(Propiedad propiedades);
	
	public Propiedad get(int id);
	
	public void delete(int id);

}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Propiedades;

public interface PropiedadService {

	public List<Propiedades> getAll();
	
	public void save(Propiedades propiedades);
	
	public Propiedades get(int id);
	
	public void delete(int id);

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

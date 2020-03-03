<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Arrendatario;

import java.util.List;

public interface ArrendatarioService {

public List<Arrendatario> getAll();
	
	public void save(Arrendatario arrendatario);
	
	public Arrendatario get(int id);
	
	public void delete(int id);
	
}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Arrendatario;

public interface ArrendatarioService {

public List<Arrendatario> getAll();
	
	public void save(Arrendatario arrendatario);
	
	public Arrendatario get(int id);
	
	public void delete(int id);
	
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

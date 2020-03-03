<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Universidad;

import java.util.List;

public interface UniversidadService {
	

	public List<Universidad> getAll();
	
	public void save(Universidad universidad);
	
	public Universidad get(int id);
	
	public void delete(int id);
}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Universidad;

public interface UniversidadService {
	

	public List<Universidad> getAll();
	
	public void save(Universidad universidad);
	
	public Universidad get(int id);
	
	public void delete(int id);
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

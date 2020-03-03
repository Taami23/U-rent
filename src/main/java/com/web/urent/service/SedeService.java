<<<<<<< HEAD
package com.web.urent.service;

import com.web.urent.model.Sede;

import java.util.List;

public interface SedeService {

	public List<Sede> getAll();
	
	public void save(Sede sede);
	
	public Sede get(int id);
	
	public void delete(int id);
}
=======
package web.urent.service;

import java.util.List;

import web.urent.model.Sede;

public interface SedeService {

	public List<Sede> getAll();
	
	public void save(Sede sede);
	
	public Sede get(int id);
	
	public void delete(int id);
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

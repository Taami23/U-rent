package com.web.urent.service;

import com.web.urent.model.Sede;

import java.util.List;

public interface SedeService {

	public List<Sede> getAll();
	
	public void save(Sede sede);
	
	public Sede get(int id);
	
	public void delete(int id);
}

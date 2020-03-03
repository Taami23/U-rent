package com.web.urent.service;

import com.web.urent.model.Universidad;

import java.util.List;

public interface UniversidadService {
	

	public List<Universidad> getAll();
	
	public void save(Universidad universidad);
	
	public Universidad get(int id);
	
	public void delete(int id);
}

package com.web.urent.service;

import com.web.urent.model.Universidad;

import java.util.List;
import java.util.Optional;

public interface UniversidadService {

	public List<Universidad> getAll();
	
	public Universidad save(Universidad Universidad);
	
	public Optional<Universidad> get(int id);
	
	public Universidad delete(int id);
}

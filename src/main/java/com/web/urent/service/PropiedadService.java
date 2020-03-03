package com.web.urent.service;

import com.web.urent.model.Propiedad;

import java.util.List;
import java.util.Optional;

public interface PropiedadService {

	public List<Propiedad> getAll();
	
	public Propiedad save(Propiedad Propiedad);
	
	public Optional<Propiedad> get(int id);
	
	public Propiedad delete(int id);
}

package com.web.urent.service;

import com.web.urent.model.Propiedad;

import java.util.List;

public interface PropiedadService {

	public List<Propiedad> getAll();
	
	public void save(Propiedad propiedades);
	
	public Propiedad get(int id);
	
	public void delete(int id);

}


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


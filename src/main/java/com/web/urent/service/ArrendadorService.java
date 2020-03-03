
package com.web.urent.service;

import com.web.urent.model.Arrendador;

import java.util.List;
import java.util.Optional;

public interface ArrendadorService {

	public List<Arrendador> getAll();
	
	public Arrendador save(Arrendador Arrendador);
	
	public Optional<Arrendador> get(int id);
	
	public Arrendador delete(int id);
}

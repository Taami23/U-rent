
package com.web.urent.service;

import com.web.urent.model.Arrendatario;

import java.util.List;
import java.util.Optional;

public interface ArrendatarioService {

	public List<Arrendatario> getAll();
	
	public Arrendatario save(Arrendatario Arrendatario);
	
	public Optional<Arrendatario> get(int id);
	
	public Arrendatario delete(int id);
}


package com.web.urent.service;

import com.web.urent.model.Arrendatario;

import java.util.List;

public interface ArrendatarioService {

public List<Arrendatario> getAll();
	
	public void save(Arrendatario arrendatario);
	
	public Arrendatario get(int id);
	
	public void delete(int id);
	
}

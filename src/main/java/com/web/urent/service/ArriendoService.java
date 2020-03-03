
package com.web.urent.service;

import com.web.urent.model.Arriendo;

import java.util.List;
import java.util.Optional;

public interface ArriendoService {

	public List<Arriendo> getAll();
	
	public Arriendo save(Arriendo Arriendo);
	
	public Optional<Arriendo> get(int id);
	
	public Arriendo delete(int id);
}


package com.web.urent.service;

import com.web.urent.model.Arriendo;

import java.util.List;
import java.util.Optional;

public interface ArriendoService {

	public List<Arriendo> getAllArrendador(int id);

	public List<Arriendo> getAllArrendatario(int id);

	public List<Arriendo> getAll();

	public List<Arriendo> getAllByInmueble(int id1, int id2);

	public Arriendo save(Arriendo Arriendo);
	
	public Optional<Arriendo> get(int id);
	
	public Arriendo delete(int id);
}

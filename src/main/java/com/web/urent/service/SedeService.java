
package com.web.urent.service;

import com.web.urent.model.Sede;

import java.util.List;
import java.util.Optional;

public interface SedeService {

	public List<Sede> getAll();
	
	public Sede save(Sede Sede);
	
	public Optional<Sede> get(int id);
	
	public Sede delete(int id);
}


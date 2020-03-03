package com.web.urent.service;


import com.web.urent.model.Arriendo;

import java.util.List;

public interface ArriendoService{
public List<Arriendo> getAll();
	
	public void save(Arriendo a);
	
	public Arriendo get(int id);
	
	public void delete(int id);
}

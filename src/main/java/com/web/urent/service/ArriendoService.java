<<<<<<< HEAD
package com.web.urent.service;


import com.web.urent.model.Arriendo;

import java.util.List;

public interface ArriendoService{
public List<Arriendo> getAll();
	
	public void save(Arriendo a);
	
	public Arriendo get(int id);
	
	public void delete(int id);
}
=======
package web.urent.service;


import java.util.List;

import web.urent.model.Arriendo;

public interface ArriendoService{
public List<Arriendo> getAll();
	
	public void save(Arriendo a);
	
	public Arriendo get(int id);
	
	public void delete(int id);
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f

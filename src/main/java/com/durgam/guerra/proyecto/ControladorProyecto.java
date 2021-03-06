package com.durgam.guerra.proyecto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorProyecto {
	
	@Autowired
	private RepositorioProyecto repositorioProyecto;
	
	@RequestMapping("/proyectos")
	public List<Proyecto> obtenerProyectos(){
		return repositorioProyecto.findAll();
		
	}
	
	@RequestMapping("/proyectos/{id}")
	public Proyecto obtenerProyecto(@PathVariable Long id){
		return repositorioProyecto.findOne(id);		
	}
	
}

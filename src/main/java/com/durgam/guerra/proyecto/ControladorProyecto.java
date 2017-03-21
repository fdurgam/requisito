package com.durgam.guerra.proyecto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorProyecto {
	
	@RequestMapping("/proyectos")
	public String obtenerProyectos(){
		return "hola";
	}
	
}

package com.durgam.guerra;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.durgam.guerra.proyecto.Proyecto;
import com.durgam.guerra.proyecto.RepositorioProyecto;

@SpringBootApplication
public class GestionRequisitosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionRequisitosApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner data(RepositorioProyecto repositorio){
		return(args) -> {
			//grabar proyectos
			repositorio.save(new Proyecto ("Proyecto 1", "Cambio de version de BBDD"));
			repositorio.save(new Proyecto ("Proyecto 2", "Segundo proyecto"));
			repositorio.save(new Proyecto ("Proyecto 3", "Sistema Contable"));
		};
	}
	
}

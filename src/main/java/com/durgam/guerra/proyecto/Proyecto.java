package com.durgam.guerra.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombreProyecto;
	private String descripcionProyecto;
	
	public Proyecto() {
	}
	
	public Proyecto(String nombreProyecto, String descripcionProyecto) {
		super();
		this.nombreProyecto = nombreProyecto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}


	public String getDescripcionProyecto() {
		return descripcionProyecto;
	}

	public void setDescripcionProyecto(String descripcionProyecto) {
		this.descripcionProyecto = descripcionProyecto;
	}	
	
}

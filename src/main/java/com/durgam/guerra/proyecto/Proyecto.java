package com.durgam.guerra.proyecto;



import java.util.Date;

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
	private Date fechaInicioProyecto;
	
	public Proyecto() {
	}
	
	public Proyecto(String nombreProyecto, Date fechaInicioProyecto) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.fechaInicioProyecto = fechaInicioProyecto;
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

	public Date getFechaInicioProyecto() {
		return fechaInicioProyecto;
	}

	public void setFechaInicioProyecto(Date fechaInicioProyecto) {
		this.fechaInicioProyecto = fechaInicioProyecto;
	}
	
	
	
}

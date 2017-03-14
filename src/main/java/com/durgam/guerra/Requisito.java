package com.durgam.guerra;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Requisito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String Resumen;
	private Date FechaCreacion;
	private String Descripcion;
	private String CreadoPor;
	private String Tipo;
	private String Prioridad;

	
}

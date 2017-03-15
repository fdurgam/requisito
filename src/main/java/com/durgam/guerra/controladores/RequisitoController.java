package com.durgam.guerra.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.durgam.guerra.modelos.Requisito;
import com.durgam.guerra.modelos.RequisitoRepositorio;

@Controller
@RequestMapping("/requisito")

public class RequisitoController {
	private RequisitoRepositorio requisitoRepositorio;
	
	@Autowired
	public RequisitoController ( RequisitoRepositorio requisitoRepositorio) {
		this.requisitoRepositorio = requisitoRepositorio;
	}
	
	@RequestMapping(value="/{listaRequisitos}", method=RequestMethod.GET)
	public String listaRequisitos(@PathVariable("listaRequisitos") String lista, Model modelo){
		List<Requisito> listaRequisitos = 
				requisitoRepositorio.findAll();
		if (listaRequisitos != null) {
			modelo.addAttribute("requisitos", listaRequisitos);
		}
		return "listaRequisitos";
	}
	
	public String agregarRequisito(@PathVariable("requisito") String requisito, Requisito requisito){
		
	}
}

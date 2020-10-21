package com.api.tareas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.tareas.models.service.ITareaService;
import com.api.tareas.tareas.models.entity.Tarea;

@RestController
public class TareaController {

	@Autowired
	private ITareaService tareaService;
	
	@GetMapping("/listar")
	public List<Tarea> listar() {
		return tareaService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Tarea detalle(@PathVariable Long id) {
		return tareaService.findById(id);
	}
	
	
}

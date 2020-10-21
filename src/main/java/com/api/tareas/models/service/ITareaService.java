package com.api.tareas.models.service;

import java.util.List;

import com.api.tareas.tareas.models.entity.Tarea;

public interface ITareaService {

	public List<Tarea> findAll(); //usamos mismo nombre metodo que el repository
	public Tarea findById(Long id);

}

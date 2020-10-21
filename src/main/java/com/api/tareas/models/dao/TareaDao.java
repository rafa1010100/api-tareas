package com.api.tareas.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.tareas.tareas.models.entity.Tarea;

public interface TareaDao extends CrudRepository<Tarea, Long>{

}

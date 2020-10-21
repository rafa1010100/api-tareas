package com.api.tareas.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.tareas.models.dao.TareaDao;
import com.api.tareas.tareas.models.entity.Tarea;

@Service
public class TareaServiceImpl implements ITareaService{
	
	@Autowired
	private TareaDao tareaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tarea> findAll() {
		return (List<Tarea>) tareaDao.findAll();
	}

	@Override
	public Tarea findById(Long id) {
		
		return tareaDao.findById(id).orElse(null);
	}
	

}

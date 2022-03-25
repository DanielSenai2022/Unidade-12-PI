package com.app.databasepi.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.databasepi.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
	
}


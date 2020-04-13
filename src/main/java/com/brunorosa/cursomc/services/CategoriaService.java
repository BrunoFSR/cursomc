package com.brunorosa.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunorosa.cursomc.domain.Categoria;
import com.brunorosa.cursomc.repositories.CategoriaRepository;
import com.brunorosa.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) { 
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
	"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}

package com.nosreme.marte.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosreme.marte.domain.Categoria;
import com.nosreme.marte.repositories.CategoriaRepository;
import com.nosreme.marte.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria Buscar(Integer id) {
		Optional<Categoria> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + Categoria.class.getName()));
	}
}

package com.nosreme.marte.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosreme.marte.domain.Cliente;
import com.nosreme.marte.repositories.ClienteRepository;
import com.nosreme.marte.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repositorio;
	
	public Cliente Buscar(Integer id) {
		Optional<Cliente> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + Cliente.class.getName()));
	}
}

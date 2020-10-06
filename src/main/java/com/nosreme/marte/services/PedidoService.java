package com.nosreme.marte.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosreme.marte.domain.Pedido;
import com.nosreme.marte.repositories.PedidoRepository;
import com.nosreme.marte.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {  
	@Autowired
	private PedidoRepository repositorio;
	
	public Pedido Buscar(Integer id) {
		Optional<Pedido> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + Pedido.class.getName()));
	}
}

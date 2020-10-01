package com.nosreme.marte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosreme.marte.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

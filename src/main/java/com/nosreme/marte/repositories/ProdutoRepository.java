package com.nosreme.marte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosreme.marte.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}

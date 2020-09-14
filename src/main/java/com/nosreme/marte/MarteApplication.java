package com.nosreme.marte;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nosreme.marte.domain.Categoria;
import com.nosreme.marte.repositories.CategoriaRepository;

@SpringBootApplication
public class MarteApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MarteApplication.class, args);
	}

	
	public void run(String... args) throws Exception{
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório ");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}
	
}

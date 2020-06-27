package org.fatec.trabLabEng.stockSystem.repository;

import org.fatec.trabLabEng.stockSystem.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,String>{
	
	Categoria findByCodCategoria(long codCategoria);
	
}
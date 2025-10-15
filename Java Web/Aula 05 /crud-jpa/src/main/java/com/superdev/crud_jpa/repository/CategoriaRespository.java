package com.superdev.crud_jpa.repository;

import com.superdev.crud_jpa.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRespository extends JpaRepository<Categoria, Integer> {
}

package com.curso.venda.repositories;

import com.curso.venda.entities.Category;
import com.curso.venda.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.curso.venda.repositories;

import com.curso.venda.entities.Order;
import com.curso.venda.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.OrderItem;
import com.educandoweb.curso.entities.pk.OrderItemPk;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPk>{

	

}

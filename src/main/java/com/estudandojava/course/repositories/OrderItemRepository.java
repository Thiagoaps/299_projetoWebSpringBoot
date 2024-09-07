package com.estudandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.course.entities.OrderItem;
import com.estudandojava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}

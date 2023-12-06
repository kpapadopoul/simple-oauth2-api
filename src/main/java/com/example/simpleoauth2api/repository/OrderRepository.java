package com.example.simpleoauth2api.repository;

import com.example.simpleoauth2api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

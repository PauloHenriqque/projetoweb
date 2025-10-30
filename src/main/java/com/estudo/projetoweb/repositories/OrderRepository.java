package com.estudo.projetoweb.repositories;

import com.estudo.projetoweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
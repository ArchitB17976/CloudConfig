package com.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.module.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>
{}

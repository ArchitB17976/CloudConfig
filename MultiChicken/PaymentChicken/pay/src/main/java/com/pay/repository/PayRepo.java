package com.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pay.module.Pay;

@Repository
public interface PayRepo extends JpaRepository<Pay, Long>
{}

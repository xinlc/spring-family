package com.example.springbucks.hateoas.waiter.repository;

import com.example.springbucks.hateoas.waiter.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder, Long> {
}

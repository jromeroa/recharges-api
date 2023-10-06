package com.jhonny.rechargesapi.Operator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Integer> {
    // Custom query methods if needed
}
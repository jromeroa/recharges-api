package com.jhonny.rechargesapi.Recharge;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RechargeRepository extends JpaRepository<Recharge, Integer> {
    // Custom query methods if needed
}
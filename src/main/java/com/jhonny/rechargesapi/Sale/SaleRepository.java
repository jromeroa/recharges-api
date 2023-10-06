package com.jhonny.rechargesapi.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
    // Custom query methods if needed
}
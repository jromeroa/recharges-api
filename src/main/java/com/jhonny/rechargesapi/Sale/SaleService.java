package com.jhonny.rechargesapi.Sale;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final SaleRepository saleRepository;

    public void createSale(Sale sale){
        saleRepository.save(sale);
    }
}

package com.jhonny.rechargesapi.Sale;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final RechargeRepository rechargeRepository;

    public void createRecharge(Sale recharge){
        rechargeRepository.save(recharge);
    }
}

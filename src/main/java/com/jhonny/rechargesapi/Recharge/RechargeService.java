package com.jhonny.rechargesapi.Recharge;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RechargeService {
    private final RechargeRepository rechargeRepository;

    public void createRecharge(Recharge recharge){
        rechargeRepository.save(recharge);
    }
}

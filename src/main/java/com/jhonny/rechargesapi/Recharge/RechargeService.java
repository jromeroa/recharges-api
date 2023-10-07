package com.jhonny.rechargesapi.Recharge;

import java.util.List;
import org.springframework.stereotype.Service;
import com.jhonny.rechargesapi.Operator.Operator;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RechargeService {
    private final RechargeRepository rechargeRepository;

    public void createRecharge(Recharge recharge){
        rechargeRepository.save(recharge);
    }

    public List<Recharge> getAllRecharges() {
        return rechargeRepository.findAll();
    }

    public List<Recharge> getRechargesByOperator(Operator operator) {
        return rechargeRepository.findByOperator(operator);
    }

    public Recharge getRechargeById(Integer rechargeId){
        Recharge recharge = new Recharge(rechargeId, null, rechargeId, null);
        return recharge;
    }
}

package com.jhonny.rechargesapi.Recharge;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jhonny.rechargesapi.Operator.Operator;
import com.jhonny.rechargesapi.Operator.OperatorService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/recharges")
@RequiredArgsConstructor
public class RechargeController {

    private final RechargeService rechargeService;
    private final OperatorService operatorService;

    @PostMapping
    public void createRecharge(@RequestBody Recharge recharge){
        rechargeService.createRecharge(recharge);
    }

    @GetMapping
    public List<Recharge> getAllRecharges() {
        return rechargeService.getAllRecharges();
    }
    
    @GetMapping("/operator/{operatorId}")
    public List<Recharge> getRechargesByOperator(@PathVariable Integer operatorId) {
        Operator operator = operatorService.getOperatorById(operatorId);
        return rechargeService.getRechargesByOperator(operator);
    }
}

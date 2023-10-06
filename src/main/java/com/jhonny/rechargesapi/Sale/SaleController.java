package com.jhonny.rechargesapi.Recharge;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/recharge")
@RequiredArgsConstructor
public class RechargeController {

    private final RechargeService rechargeService;

    @PostMapping
    public void createRecharge(@RequestBody Recharge recharge){
        rechargeService.createRecharge(recharge);
    }
    
}

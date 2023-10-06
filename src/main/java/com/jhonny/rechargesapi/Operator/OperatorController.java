package com.jhonny.rechargesapi.Operator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/operator")
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorSevice operatorSevice;

    @PostMapping
    public void createOperator(@RequestBody Operator operator){
        operatorSevice.createOperator(operator);
    }
    
}

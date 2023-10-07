package com.jhonny.rechargesapi.Operator;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/operators")
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorService operatorSevice;

    @PostMapping
    public void createOperator(@RequestBody Operator operator){
        operatorSevice.createOperator(operator);
    }
    @GetMapping
    public List<Operator> getAllOperators() {
        return operatorSevice.getAllOperators();
    }
    
}

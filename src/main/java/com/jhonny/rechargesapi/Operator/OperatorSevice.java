package com.jhonny.rechargesapi.Operator;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperatorSevice {
    private final OperatorRepository operatorRepository;

    public void createOperator(Operator operator){
        operatorRepository.save(operator);
    }
}

package com.jhonny.rechargesapi.Operator;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperatorService {
    private final OperatorRepository operatorRepository;

    public void createOperator(Operator operator){
        operatorRepository.save(operator);
    }

    public List<Operator> getAllOperators() {
        return operatorRepository.findAll();
    }

    public Operator getOperatorById(Integer operatorId) {
        Operator operator = new Operator(operatorId, null);
        return operator;
    }
}

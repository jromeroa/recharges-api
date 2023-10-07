package com.jhonny.rechargesapi.Recharge;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jhonny.rechargesapi.Operator.Operator;

public interface RechargeRepository extends JpaRepository<Recharge, Integer> {
     List<Recharge> findByOperator(Operator operator);
}
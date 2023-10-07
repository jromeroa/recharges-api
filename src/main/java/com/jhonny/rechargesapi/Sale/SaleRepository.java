package com.jhonny.rechargesapi.Sale;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jhonny.rechargesapi.Customer.Customer;
import com.jhonny.rechargesapi.Recharge.Recharge;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
     List<Sale> findByCustomer(Customer customer);
     List<Sale> findByRecharge(Recharge recharge);
}
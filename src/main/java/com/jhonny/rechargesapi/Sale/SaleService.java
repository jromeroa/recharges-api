package com.jhonny.rechargesapi.Sale;

import java.util.List;
import org.springframework.stereotype.Service;
import com.jhonny.rechargesapi.Customer.Customer;
import com.jhonny.rechargesapi.Recharge.Recharge;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final SaleRepository saleRepository;

    public void createSale(Sale sale){
        saleRepository.save(sale);
    
    }

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public List<Sale> getSalesByCustomer(Customer customer) {
        return saleRepository.findByCustomer(customer);
    }

    public List<Sale> getSalesByRecharge(Recharge recharge) {
        return saleRepository.findByRecharge(recharge);
    }
}

package com.jhonny.rechargesapi.Sale;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jhonny.rechargesapi.Customer.Customer;
import com.jhonny.rechargesapi.Customer.CustomerSevice;
import com.jhonny.rechargesapi.Recharge.Recharge;
import com.jhonny.rechargesapi.Recharge.RechargeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/sales")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;
    private final CustomerSevice customerService;
    private final RechargeService rechargeService;

    @PostMapping
    public void createSale(@RequestBody Sale sale){
        saleService.createSale(sale);
    }
    @GetMapping
    public List<Sale> getAllSaless() {
        return saleService.getAllSales();
    }
    @GetMapping("/customer/{customerId}")
    public List<Sale> getSalesByCustomer(@PathVariable Integer customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        return saleService.getSalesByCustomer(customer);
    }

    @GetMapping("/recharge/{rechargeId}")
    public List<Sale> getSalesByRecharge(@PathVariable Integer rechargeId) {
        Recharge recharge = rechargeService.getRechargeById(rechargeId);
        return saleService.getSalesByRecharge(recharge);
    }
}

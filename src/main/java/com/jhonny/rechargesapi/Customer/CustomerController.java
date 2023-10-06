package com.jhonny.rechargesapi.Customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerSevice customerSevice;

    @PostMapping
    public void createCustomer(@RequestBody Customer customer){
        customerSevice.createCustomer(customer);
    }
    
}

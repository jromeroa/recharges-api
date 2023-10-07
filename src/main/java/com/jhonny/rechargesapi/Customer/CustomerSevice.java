package com.jhonny.rechargesapi.Customer;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerSevice {
    private final CustomerRepository customerRepository;

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    public Customer getCustomerById(Integer customerId){
        Customer customer = new Customer(customerId, null, null);
        return customer;
    }
}

package com.jhonny.rechargesapi.Sale;

import java.sql.Date;
import com.jhonny.rechargesapi.Customer.Customer;
import com.jhonny.rechargesapi.Recharge.Recharge;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "recharge_id")
    private Recharge recharge;
    private Date saleDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private String person;
}

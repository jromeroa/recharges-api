package com.jhonny.rechargesapi.Sale;

import java.sql.Date;
import java.time.LocalDate;

import com.jhonny.rechargesapi.Customer.Customer;
import com.jhonny.rechargesapi.Recharge.Recharge;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sale")
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

    // Add a method to set saleDate to the current date before persisting
    @PrePersist
    protected void onCreate() {
        saleDate = Date.valueOf(LocalDate.now());
    }
}

package com.example.demo2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@Table(name = "customers")
public class Customer {
    @Id
    private Integer customerNumber;
    private String customerName;
    private String contactFirstName;
    private String contactLastName;
    private String password;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Integer salesRepEmployeeNumber;
    private BigDecimal creditLimit;
    private String role;
}

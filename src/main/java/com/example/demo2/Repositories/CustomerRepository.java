package com.example.demo2.Repositories;

import com.example.demo2.Entities.Customer;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CustomerRepository {
    private EntityManager entityManager;

    private EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = EntityManagerBuilder.getEntityManager();
        }
        return entityManager;
    }

    public List<Customer> findAll() {
        return getEntityManager().createQuery("select c from Customer c").getResultList();
    }

    public Customer findByName(String name) {
        return findAll().stream().filter(c -> c.getCustomerName().equals(name)).findFirst().orElse(null);
    }
}

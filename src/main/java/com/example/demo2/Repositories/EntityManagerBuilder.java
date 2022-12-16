package com.example.demo2.Repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerBuilder {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("classic-models");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}

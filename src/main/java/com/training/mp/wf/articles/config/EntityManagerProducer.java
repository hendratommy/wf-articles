package com.training.mp.wf.articles.config;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EntityManagerProducer {
    @PersistenceContext
    private EntityManager em;

    @Produces
    @RequestScoped
    public EntityManager entityManager() {
        return em;
    }
}

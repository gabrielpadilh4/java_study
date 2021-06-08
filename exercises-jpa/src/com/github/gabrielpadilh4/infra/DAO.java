package com.github.gabrielpadilh4.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> entity;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercises-jpa");
        } catch (Exception e) {
            //
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> entity) {
        this.entity = entity;
        this.em = emf.createEntityManager();
    }

    public DAO<E> openTransaction() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> closeTransaction() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> persist(E entity) {
        em.persist(entity);
        return this;
    }

    public DAO<E> atomicPersist(E entity) {
        this.openTransaction().persist(entity).closeTransaction();
        return this;
    }

    public List<E> getAll() {
        return getAll(10, 0);
    }

    public List<E> getAll(int limit, int offset) {
        if (entity == null) {
            throw new UnsupportedOperationException("Entity is null");
        }

        String jpql = "SELECT e FROM " + entity.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, entity);
        query.setMaxResults(limit);
        query.setFirstResult(offset);

        return query.getResultList();
    }

    public E getById(Object id){
        return em.find(entity, id);
    }

    public void close() {
        em.close();
    }
}

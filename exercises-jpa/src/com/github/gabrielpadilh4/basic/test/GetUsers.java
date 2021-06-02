package com.github.gabrielpadilh4.basic.test;

import com.github.gabrielpadilh4.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class GetUsers {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "SELECT u FROM User u";

        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setMaxResults(5);

        List<User> users = query.getResultList();

        for(User user: users){
            System.out.println(user);
        }

        em.close();
        emf.close();
    }
}

package com.github.gabrielpadilh4.basic.test;

import com.github.gabrielpadilh4.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetUser {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        User user = em.find(User.class, 1);

        System.out.println(user.getName());

        em.close();
        emf.close();
    }
}

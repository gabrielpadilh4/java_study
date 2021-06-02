package com.github.gabrielpadilh4.basic.test;

import com.github.gabrielpadilh4.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateUser1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User user = em.find(User.class, 5);

        System.out.println(user);

        user.setName("Daniel");
        user.setEmail("daniel@mail.com");

        em.merge(user);
        System.out.println(user);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

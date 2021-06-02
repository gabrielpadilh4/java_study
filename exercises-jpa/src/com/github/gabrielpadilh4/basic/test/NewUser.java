package com.github.gabrielpadilh4.basic.test;

import com.github.gabrielpadilh4.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class NewUser {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        List<User> users = new ArrayList<>();

        User user = new User("Gabriel", "gabrielpadilhasantos@gmail.com");
        User user1 = new User("Angela", "angela@email.com");
        User user2 = new User("Carlos", "carlos@mail.com");
        User user3 = new User("Andre", "andre@email.com");
        User user4 = new User("Aguinaldo", "aguinaldo@email.com");
        User user5 = new User("Isabela", "isabela@email.com");

        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


        for(User u: users){
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();

            System.out.println("Generated ID: " + u.getId());
        }

        em.close();
        emf.close();

    }
}

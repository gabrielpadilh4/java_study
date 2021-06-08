package com.github.gabrielpadilh4.basic.test.OneToOne;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.oneToOne.Customer;
import com.github.gabrielpadilh4.model.oneToOne.Seat;

public class NewCustomerSeat2 {

    public static void main(String[] args) {

        Seat seat = new Seat("4J");
        Customer customer = new Customer("Rodrigo", seat);

        DAO<Customer> dao = new DAO<>(Customer.class);
        dao.atomicPersist(customer);

    }
}

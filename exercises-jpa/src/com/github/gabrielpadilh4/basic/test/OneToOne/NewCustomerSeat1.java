package com.github.gabrielpadilh4.basic.test.OneToOne;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.OneToOne.Customer;
import com.github.gabrielpadilh4.model.OneToOne.Seat;

public class NewCustomerSeat1 {

    public static void main(String[] args) {

        Seat seat = new Seat("2B");
        Customer customer = new Customer("Carlos", seat);

        DAO<Object> dao = new DAO<>();

        dao.openTransaction().persist(seat).persist(customer).closeTransaction().close();

    }
}

package com.github.gabrielpadilh4.basic.test.OneToOne;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.OneToOne.Customer;
import com.github.gabrielpadilh4.model.OneToOne.Seat;

public class GetCustomerSeat {

    public static void main(String[] args) {

        DAO<Customer> customerDAO = new DAO<>(Customer.class);

        Customer customer = customerDAO.getById(1L);

        System.out.println(customer.getSeat().getName());

        System.out.println(customer.getSeat().getCustomer().getName());

        customerDAO.close();

        DAO<Seat> seatDAO = new DAO<>(Seat.class);
        Seat seat = seatDAO.getById(3L);

        System.out.println(seat.getName());
        System.out.println(seat.getCustomer().getName());

        seatDAO.close();

    }
}

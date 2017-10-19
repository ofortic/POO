/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.util.ArrayList;

/**
 *
 * @author ofortich
 */
public class Account {
    Customer customer;
    ShoppingCar shoppingCar;
    ArrayList<Order> orders;
    ArrayList<Payment> payments;

    public Account() {
        customer = new Customer();
        shoppingCar = new ShoppingCar();
        orders = new ArrayList<>();
        payments = new ArrayList<>();
    }
    
}

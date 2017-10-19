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
public class Order {
    ArrayList<LineItem> lineItems;
    Account account;
    ArrayList<Payment> payments;

    public Order() {
        lineItems = new ArrayList<>();
        account = new Account();
        payments = new ArrayList<>();
    }
    
}

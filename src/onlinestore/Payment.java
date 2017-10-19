/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

/**
 *
 * @author ofortich
 */
public class Payment {
    Account account;
    Order order;

    public Payment() {
        account = new Account();
        order = new Order();
    }
    
}

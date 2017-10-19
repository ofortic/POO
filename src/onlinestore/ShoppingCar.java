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
public class ShoppingCar {
    Account account;
    ArrayList<LineItem> lineItems;
    WebUser webUser;

    public ShoppingCar() {
        account = new Account();
        lineItems = new ArrayList<>();
        webUser = new WebUser();
    }
    
}

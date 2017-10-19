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
public class LineItem {
    Product product;
    ShoppingCar shoppingCar;
    Order order;

    public LineItem() {
        product = new Product();
        shoppingCar = new ShoppingCar();
        order = new Order();
    }
    
}

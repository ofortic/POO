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
public class OnlineStore {

    private ArrayList<Customer> custumers;
    private ArrayList<Account> accounts;
    private ArrayList<Product> products;

    public OnlineStore() {
        custumers = new ArrayList<>();
        accounts = new ArrayList<>();
        products = new ArrayList<>(); 
    }
    
    public static void main(String[] args) {
        OnlineStore os = new OnlineStore();
        
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        os.addCustomer(c1);
        os.addCustomer(c2);
        os.accounts.add(c1.account);
        os.accounts.add(c2.account);
        
        Product A = new Product();
        Product B = new Product();
        os.addProduct(A);
        os.addProduct(B);
        
        os.comprarProducto(c1, A);
        os.comprarProducto(c1, A);
        os.comprarProducto(c1, A);
        os.comprarProducto(c2, A);
        os.comprarProducto(c2, B);
    }

    public void addCustomer(Customer c) {
        this.custumers.add(c);
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public void comprarProducto(Customer c, Product A) {
        
    }

}

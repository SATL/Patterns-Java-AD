/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eslem
 */
public class CartSingleton {
    public static CartSingleton cart;
    public List purchases;
    public int total=0;
    
    public CartSingleton(){
        purchases= new ArrayList();
    }
    
    public void addPurchase(Product product){
        purchases.add(product);
        total+=product.getPrice();
    }
    
    public List getPurchases(){
        return this.purchases;
    }
    
    public static CartSingleton getCart(){
        if(cart==null){
            cart=new CartSingleton();
        }
        return cart;
    }
    
    public int getTotal(){
        return total;
    }
}

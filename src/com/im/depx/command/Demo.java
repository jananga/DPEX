/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.command;

/**
 *
 * @author acer
 */
public class Demo {
    
    public static void main(String[] args) {
      Storage abcStock = new Storage();

      purchaseStorage buyStockOrder = new purchaseStorage(abcStock);
      SellStorage sellStockOrder = new SellStorage(abcStock);

      MiddleMan broker = new MiddleMan();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }

    
    
}

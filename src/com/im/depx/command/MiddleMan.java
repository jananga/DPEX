/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class MiddleMan {
    
    private List<Purchase> orderList = new ArrayList<Purchase>(); 

   public void takeOrder(Purchase order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Purchase order : orderList) {
         order.execute();
      }
      orderList.clear();
   }

    
}

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
public class purchaseStorage implements Purchase{
    
    private Storage abcStock;

   public purchaseStorage(Storage abcStock){
      this.abcStock = abcStock;
   }


   public void execute() {
      abcStock.buy();
   }

    
}

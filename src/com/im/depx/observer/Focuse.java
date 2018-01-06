/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class Focuse {
 
    private List<Finder> observers = new ArrayList<Finder>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Finder observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Finder observer : observers) {
         observer.update();
      }
   } 	

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class CareTaker {
   private List<Symble> mementoList = new ArrayList<Symble>();

   public void add(Symble state){
      mementoList.add(state);
   }

   public Symble get(int index){
      return mementoList.get(index);
   }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.memento;

/**
 *
 * @author acer
 */
public class Derivator {
    
    private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Symble saveStateToMemento(){
      return new Symble(state);
   }

   public void getStateFromMemento(Symble memento){
      state = memento.getState();
   }

    
}

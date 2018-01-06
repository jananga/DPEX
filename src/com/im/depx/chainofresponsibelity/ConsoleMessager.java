/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.chainofresponsibelity;

/**
 *
 * @author acer
 */
public class ConsoleMessager extends AbstractMessage{
    
    public ConsoleMessager(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Standard Console::Logger: " + message);
   }

    
}

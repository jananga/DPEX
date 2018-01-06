/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.observer;

/**
 *
 * @author acer
 */
public class Demo {
    
    public static void main(String[] args) {
      Focuse subject = new Focuse();

      new HexaFinder(subject);
      new OctalFinder(subject);
      new BinaryFinder(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }

    
}

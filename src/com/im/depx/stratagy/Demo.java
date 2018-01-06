/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.stratagy;

/**
 *
 * @author acer
 */
public class Demo {
    
    public static void main(String[] args) {
      Summary summary = new Summary(new Addition());		
      System.out.println("10 + 5 = " + summary.executeStrategy(10, 5));

      summary = new Summary((Strategy) new Substraction());		
      System.out.println("10 - 5 = " + summary.executeStrategy(10, 5));

      summary = new Summary((Strategy) new Multiplication());		
      System.out.println("10 * 5 = " + summary.executeStrategy(10, 5));
   }

    
}

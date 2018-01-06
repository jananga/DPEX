/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.template;

/**
 *
 * @author acer
 */
public class Demo {
    
     public static void main(String[] args) {

      Travel travel = new Hiking();
      travel.travelling();
      System.out.println();
      travel = new Rafting();
      travel.travelling();		
   }

    
}

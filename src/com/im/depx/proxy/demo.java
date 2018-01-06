/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.proxy;

/**
 *
 * @author acer
 */
public class demo {
    
    public static void main(String[] args) {
        
        File myfile = new ProxyFile("Saragaye");
      //image will be loaded from disk
      myfile.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      myfile.display(); 	

    }
    
}

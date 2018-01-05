/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.bridge;

/**
 *
 * @author rpa29
 */
public class demo {
    
    public static void main(String[] args) {
    
        TaskFormats tf = new TaskFormats("Company Tasks bridge test");
        
        tf.ct = new CompanyTasks();
        
        tf.displayAll();
        
        tf.delete("What is our moto ?");
        
        System.out.println("After Delete...");
        System.out.println("");
        
        tf.displayAll();
        
        tf.next();
        
    }
    
}

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
public class TaskFormats extends TaskManager{
    
    public TaskFormats(String catalog) {
        super(catalog);
    }
    
    public void displayAll()
    {
        System.out.println("------------------------------------------------");
        
        super.displayAll();
        
        System.out.println("------------------------------------------------");
    
    
    }
    
}

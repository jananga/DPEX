/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dpex.singleton;

/**
 *
 * @author Udari
 */
public class Wife {
    
    private String name;
    
    private static Wife wife;//2***
    
    private Wife(){//1
    
    }
    
    public static Wife getInstance()//3 Return the wife object
    {
        if(wife == null)//
        {
         wife = new Wife();
        }
            return wife;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.facade;

/**
 *
 * @author acer
 */
public class Honda implements CarShowroom{
    
     @Override
    public void modelNumber() {

        System.out.println("FIT Car.");
    }

    @Override
    public void price() {
        System.out.println("Rs : 4500000/=");

    }
    
    
}

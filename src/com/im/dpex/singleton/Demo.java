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
public class Demo {
    
    public static void main(String[] args) {
        //Wife w = new Wife();//Due to private constructor this is not allowed
        
        Wife wife1 =Wife.getInstance();        
        wife1.setName("Sitha");
        
        Wife wife2 =Wife.getInstance();        
        wife2.setName("Kalpani");
        
        System.out.println("Wife1 :"+wife1.getName());
        System.out.println("Wife2 :"+wife2.getName());

    }
}

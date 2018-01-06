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
public class Rafting extends Travel{

    @Override
    void initialize() {
        System.out.println("Decide Rafting");

    }

    @Override
    void startTravel() {
        System.out.println("Strt Rafting");
    }

    @Override
    void endTravel() {
        System.out.println("End Rafting");
    }
    
}

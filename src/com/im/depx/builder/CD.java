/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.builder;

/**
 *
 * @author acer
 */
public abstract class CD implements Packing{
    
    @Override
    public abstract String pack();
    
    @Override
    public abstract String color();
}

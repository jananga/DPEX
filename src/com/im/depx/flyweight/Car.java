/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.flyweight;

/**
 *
 * @author acer
 */
public class Car implements VehicleShape{

    private String color;
    private int width;
    private int height;
    private int squareInches;
    
    
    
    
    @Override
    public void makeShape() {
        System.out.println("The car is something like this : Colour :"+color+" Width : "+width+" Height : "+height+" Squareinches : "+squareInches);

    }

    /**
     * @param color the color to set
     */
    public Car(String color) {
        this.color = color;
        
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @param squareInches the squareInches to set
     */
    public void setSquareInches(int squareInches) {
        this.squareInches = squareInches;
    }
    
}

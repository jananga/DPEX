/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.flyweight;

import java.util.HashMap;

/**
 *
 * @author acer
 */
public class VehicleFactory {

    static final HashMap<String, VehicleShape> carShape = new HashMap<>();

    public static VehicleShape getShape(String color) {
        Car car = (Car) carShape.get(color);

        System.out.println("The Random Color is : "+color);
        
        if (car == null) {
            car = new Car(color);
            carShape.put(color, car);

            System.out.println("Creating Car of color : " + color);

        }
        return car;
    }
    
    
    public static HashMap getHashMap()
    {
    
        return carShape;
    
    }

}

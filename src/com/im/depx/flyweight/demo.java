/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author acer
 */
public class demo {

    private static final String colors[] = {"black", "red", "blue", "green", "yellow"};

    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            Car car = (Car) VehicleFactory.getShape(getRandomColor());
            car.setHeight(getRandomH());
            car.setWidth(getRandomW());
            car.setSquareInches(getRandomSI());

            car.makeShape();
        }

        System.out.println("===========================================");
        
        HashMap mp = VehicleFactory.getHashMap();
        
         Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey());// + " = " + pair.getValue());
        //it.remove(); // avoids a ConcurrentModificationException
    }
        
    }

    private static String getRandomColor() {

          if(count == 4)
          {
              count --;
          }
      

        System.out.println("Return color is : " + count);
        
        return colors[count++];
    }

    private static int getRandomW() {
        
        return (int) (Math.random() * 100);
    }

    private static int getRandomH() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomSI() {
        return (int) (Math.random() * 100);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.decorator;

/**
 *
 * @author acer
 */
public class HeavyVehicle implements Vehicle {

    @Override
    public String assembleVehicle() {
        return "Heavy Parts.";

    }

    @Override
    public double vehiclePrice() {
        return 4500000;
    }

}

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
public class LightVehicle extends VehicleDecorator{
    
    public LightVehicle(Vehicle vehicle) {
        super(vehicle);
    }
    
    
    
    @Override
    public String assembleVehicle() {
        return super.assembleVehicle()+" moderate vehicles";

    }

    @Override
    public double vehiclePrice() {
        return 124553.562+super.vehiclePrice();

    }

    
}

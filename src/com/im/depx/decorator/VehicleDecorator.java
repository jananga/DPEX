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
public abstract class VehicleDecorator implements Vehicle {

    private Vehicle newVehicle;

    public VehicleDecorator(Vehicle vehicle) {

        this.newVehicle = vehicle;

    }

    @Override
    public String assembleVehicle() {
        return newVehicle.assembleVehicle();

    }

    @Override
    public double vehiclePrice() {
        return newVehicle.vehiclePrice();

    }

}

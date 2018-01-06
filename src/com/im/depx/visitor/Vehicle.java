/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.visitor;

/**
 *
 * @author acer
 */
public class Vehicle implements VehiclePart {

    VehiclePart[] vps;

    public Vehicle() {
        vps = new VehiclePart[]{new Mirror(), new Wheel(), new VBody()};

    }

    @Override
    public void accept(VehiclePartVisitor vehiclePartVisitor) {
        for (int i = 0; i < vps.length; i++) {
            vps[i].accept(vehiclePartVisitor);
        }
        vehiclePartVisitor.visit(this);
    }
}

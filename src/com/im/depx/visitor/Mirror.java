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
public class Mirror implements VehiclePart {

    Mirror() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accept(VehiclePartVisitor vehiclePartVisitor) {
        vehiclePartVisitor.visit(this);
    }

}

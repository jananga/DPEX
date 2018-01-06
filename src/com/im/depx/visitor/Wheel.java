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
public class  Wheel implements VehiclePart{

    @Override
    public void accept(VehiclePartVisitor vehiclePartVisitor) {
        vehiclePartVisitor.visit(this);
        
        
        
        }
    
}

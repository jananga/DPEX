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
public class VehiclePartDisplayVisitor implements VehiclePartVisitor{

    @Override
    public void visit(Wheel wheel) {
      System.out.println("Displaying Wheel.");
    }

    @Override
    public void visit(VBody body) {
      System.out.println("Displaying body.");
    }

    @Override
    public void visit(Mirror mirror) {
      System.out.println("Displaying mirror.");
    }

    @Override
    public void visit(Door door) {
      System.out.println("Displaying door.");
    }

    @Override
    public void visit(Vehicle vehicle) {
      System.out.println("Displaying Vehicle.");
    }
    
}

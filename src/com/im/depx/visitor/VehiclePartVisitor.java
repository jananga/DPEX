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
public interface VehiclePartVisitor {
    public void visit(Wheel wheel);
	public void visit(VBody body);
	public void visit(Mirror mirror);
	public void visit(Door door);

    public void visit(Vehicle vehicle);

}

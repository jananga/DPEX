/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.composite;

/**
 *
 * @author acer
 */
public class AssociationMember implements Member{

    private int id;
    private String name;
    private double salary;

    public AssociationMember(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double gerSalary() {
        return salary;
    }

    @Override
    public void addMember(Member member) {

    }

    @Override
    public void removeMember(Member member) {
    }

    @Override
    public Member getChild(int i) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Id : " + getID());
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + gerSalary());

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author acer
 */
public class AssociationHead implements Member {

    private int id;
    private String name;
    private double salary;

    public AssociationHead(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    List<Member> mem = new ArrayList<>();

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
        mem.add(member);

    }

    @Override
    public void removeMember(Member member) {
        mem.remove(member);

    }

    @Override
    public Member getChild(int i) {
     return   mem.get(i);
    }

    @Override
    public void print() {

        System.out.println("Id : "+getID());
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+gerSalary());
        System.out.println("--------------");
        
            Iterator <Member> iter = mem.iterator();

            while(iter.hasNext())
            {
            
            Member memb = iter.next();
            
            memb.print();
            
            }
        

    }
    
    
    
    
    

}

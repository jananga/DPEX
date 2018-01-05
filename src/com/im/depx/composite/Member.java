/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.composite;

/**
 *
 * @author rpa29
 */
public interface Member {
    
    public int getID();
    public String getName();
    public double gerSalary();
    
    public void addMember(Member member);
    public void removeMember(Member member);
    
    public Member getChild(int i);
    
}

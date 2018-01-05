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
public class demo {

    public static void main(String[] args) {

        Member mem1 = new AssociationMember(1, "jananga", 70000);
        Member mem2 = new AssociationSecretary(2, "kasun", 6000);
        Member mem3 = new AssociationSecretary(3, "namal", 6000);

        Member head = new AssociationHead(4, "Sumith", 5000000);

        head.addMember(mem1);
        head.addMember(mem2);

        head.addMember(mem3);
        
        head.print();

    }

}

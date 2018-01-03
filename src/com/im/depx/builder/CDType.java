/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class CDType {

    private List<Packing> items = new ArrayList<Packing>();

    public void addItem(Packing item) {
        items.add(item);
    }

    public void getCost() {

        for (Packing packs : items) {
            packs.price();
        }

    }
    
    public void showItems()
    {
        for(Packing pack : items){
        
            System.out.println("CD Name : "+pack.pack());
            System.out.println("Price : "+pack.price());
            System.out.println("Color :"+pack.color());
        }
    
    
    }

}

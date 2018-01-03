/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.builder;

/**
 *
 * @author acer
 */
public class Demo {

    public static void main(String[] args) {

        CDBuilder cdb = new CDBuilder();

        CDType cdTypeOne = cdb.buildImationsCD();

        cdTypeOne.showItems();

        CDType cdTypeTwo = cdb.buildTransendCD();
        
        cdTypeTwo.showItems();

    }

}

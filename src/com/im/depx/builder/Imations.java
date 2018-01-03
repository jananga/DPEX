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
public class Imations extends Company {

    @Override
    public double price() {
        return 80;
    }

    @Override
    public String pack() {
        return "Imation CD";
    }

    @Override
    public String color() {
        return "Black";
    }

}

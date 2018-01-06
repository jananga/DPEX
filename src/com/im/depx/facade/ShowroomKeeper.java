/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.facade;

/**
 *
 * @author acer
 */
public class ShowroomKeeper {

    private CarShowroom zuzuki;
    private CarShowroom izuzu;
    private CarShowroom honda;

    public ShowroomKeeper() {
        this.zuzuki = new Zuzuki();
        this.izuzu = new Izuzu();
        this.honda = new Honda();

    }

    public void zuzukiSale() {
        zuzuki.modelNumber();
        zuzuki.price();
    }

    public void izuzuSale() {
        izuzu.modelNumber();
        izuzu.price();

    }

    public void hondaSale() {

        honda.modelNumber();
        honda.price();
    }

}

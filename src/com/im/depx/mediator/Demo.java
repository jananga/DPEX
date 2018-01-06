/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.mediator;

/**
 *
 * @author acer
 */
public class Demo {

    public static void main(String[] args) {
        Subscriber robert = new Subscriber("Robert");
        Subscriber john = new Subscriber("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}

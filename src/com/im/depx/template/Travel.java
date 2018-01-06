/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.template;

/**
 *
 * @author acer
 */
public abstract class Travel {

    abstract void initialize();

    abstract void startTravel();

    abstract void endTravel();

    //template method
    public final void travelling() {

        //initialize the travel
        initialize();

        //start travel
        startTravel();

        //end travel
        endTravel();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.proxy;

/**
 *
 * @author acer
 */
public class RealFile implements File {
    
        String filename;

    public RealFile(String filename)
    {
        this.filename = filename;
        loadFromDisk();
    
    }


    @Override
    public void display() {

        System.out.println("Display file : " + filename);
    }

    public void loadFromDisk() {

        System.out.println("Load from disk file : " + filename);

    }

}

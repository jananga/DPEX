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
public class ProxyFile implements File{

    private RealFile realFile;
    private String filename;
    
    public ProxyFile(String filename)
    {
        this.filename = filename;
    
    }
    
    @Override
    public void display() {

        if(realFile == null)
        {
            realFile = new RealFile(filename);
        }
        
        realFile.display();
    }
    
}

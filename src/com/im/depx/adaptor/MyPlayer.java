/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.depx.adaptor;

/**
 *
 * @author Udari
 */
public class MyPlayer implements CustomPlayer {
    
    @Override
    public void play(String type, String name) {
        if (type.equals("mp3")) {
            System.out.println("Play by My player - " + name);
        } else if (type.equals("mp4") || type.equals("avi")) {
            MediaAdaptor ma = new MediaAdaptor(type);
            ma.play(type, name);
        }
        
    }
    
}

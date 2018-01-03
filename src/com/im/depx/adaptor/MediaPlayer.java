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
public class MediaPlayer implements Player{

    @Override
    public void playMedia(String name) {
            System.out.println("Playing via Media Player - "+name);

    }

    @Override
    public void playVLC(String name) {

    }
    
}

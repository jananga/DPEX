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
public class MediaAdaptor implements CustomPlayer {

    Player player;

    public MediaAdaptor(String type) {
        if (type.equals("mp4")) {
            player = new MediaPlayer();
        } else if (type.equals("avi")) {
            player = new VLCPlayer();
        }

    }

    @Override
    public void play(String type, String name) {
        if (type.equals("mp4")) {
            player.playMedia(name);
        } else if (type.equals("avi")) {
            player.playVLC(name);
        }

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.depx.filter;

/**
 *
 * @author Udari
 */
public class Client {
    
    FilterManager fm;
    
    public void setFilterManager(FilterManager fm)
    {
        this.fm = fm;
    
    }
    
    public void sendRequest(String request)
    {
        fm.execute(request);
    }
    
    
}

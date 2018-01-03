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
public class FilterManager {
    
    
    FilterChain fc1;
    
    public FilterManager(Task task)
    {
      fc1  = new FilterChain();
      fc1.setTask(task);
    
    }
    
    public void setFilter(Filter filter)
    {
        fc1.addFIlter(filter);
    }
    
    public void execute(String request)
    {
    fc1.execute(request);
    
    }
    
    
    
}

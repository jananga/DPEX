/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.depx.filter;

import java.util.ArrayList;

/**
 *
 * @author Udari
 */
public class FilterChain {
    
    private ArrayList<Filter> filters = new ArrayList<Filter>();
    
    private Task task;
    
    public void addFIlter(Filter filter)
    {
        filters.add(filter);
    }
            
    public void setTask(Task task)
    {
    this.task = task;
    
    }
    
    public void execute(String request)
    {
     for(Filter filter : filters)
     {
         filter.execute(request);
     } 
     
     task.execute(request);
    
    }
    
}

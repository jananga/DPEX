/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rpa29
 */
public class CompanyTasks implements CompanyTask{
    
    private List <String> ct = new ArrayList<>();
    private int current = 0;
    
    public CompanyTasks()
    {
        ct.add("What is our moto ?");
        ct.add("Wat is our ambition ?");
        ct.add("what is the main task of the company ? ");
        ct.add("How many Employees are there in the company ? ");
    
    }
    

    @Override
    public void nextTask() {
        if(current <= ct.size()-1)
        {
            current++;
            System.out.println(current);
        }

    }

    @Override
    public void previousTask() {

        if(current > 0)
        {
            current--;
        }
    }

    @Override
    public void newTask(String task) {

        ct.add(task);
    }

    @Override
    public void deleteTask(String task) {

        ct.remove(task);
    }

    @Override
    public void displayTask() {

        System.out.println("Current Task : "+ct.get(current));
    }

    @Override
    public void displayAllTasks() {
        for(String task : ct)
        {
            System.out.println(task);
        
        }

    }
    
}

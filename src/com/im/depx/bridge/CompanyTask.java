/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.bridge;

/**
 *
 * @author rpa29
 */
public interface CompanyTask {
    
    public void nextTask();
    public void previousTask();
    public void newTask(String task);
    public void deleteTask(String task);
    public void displayTask();
    public void displayAllTasks();
    
    
}

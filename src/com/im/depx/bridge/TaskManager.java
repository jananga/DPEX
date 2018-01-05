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
public class TaskManager {
    
    protected CompanyTask ct;
    public String catalog;
    
    public TaskManager(String catalog) {
        this.catalog = catalog;
    }
    
    public void previous() {
        ct.previousTask();
        
    }
    
    public void next() {
        ct.nextTask();
        
    }
    
    public void delete(String task) {
        ct.deleteTask(task);
        
    }
    
    public void add(String task) {
        
        ct.deleteTask(task);
        
    }
    
    
    public  void displayAll()
    {
        System.out.println("Task disply manager "+catalog);
        ct.displayAllTasks();
    
    }
    
}

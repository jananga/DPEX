/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.prototype;

/**
 *
 * @author rpa29
 */
public class StudentRecords implements Prototype{

    int studentID;
    String name, address, telno;
    
    public StudentRecords()
    {
            System.out.println("   Student Records of DMC ");  
            System.out.println("---------------------------------------------");  
            System.out.println("studentID : "+studentID+" name : "+name+" address : "+address+" telno : "+telno);

    
    }
    
    
    public StudentRecords(int studentID, String name, String address, String telno)
    {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.telno = telno;
    
    }
    
    
    
    @Override
    public Prototype getClone() {
        
        return new StudentRecords(studentID,name, address, telno);
    }
    
    public void showRecords()
    {
        System.out.println("studentID : "+studentID+" name : "+name+" address : "+address+" telno : "+telno);
    }
    
    
}

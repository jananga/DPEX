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
public class Demo {
    
    public static void main(String[] args) {
        
        StudentRecords sr = new StudentRecords(112, "Jananga Hettiarachchi", "station road kandana", "0774424059");
        
        sr.showRecords();
        StudentRecords stdObj = (StudentRecords) sr.getClone();
        
        stdObj.showRecords();
        
    }
    
}

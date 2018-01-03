/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dpex.factory;

/**
 *
 * @author Udari
 */
public class BillFactory {
    
    public static Bill createBill(String billType)
    {
        if(billType == null)
        {
            return null;
        }else if(billType.equals("DOMESTIC"))
        {
            return new DomesticBill();
        }else if(billType.equals("BUSINESS"))
        {
            return new BusinessBill();
        }else if(billType.equals("INDUSTRIAL"))
        {
            return new IndustrialBill();
        }else{
        
        return null;
        }
            
        
    }
    
}

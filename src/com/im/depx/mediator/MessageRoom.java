/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.mediator;

import java.util.Date;

/**
 *
 * @author acer
 */
public class MessageRoom {
 
       public static void showMessage(Subscriber user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }

}

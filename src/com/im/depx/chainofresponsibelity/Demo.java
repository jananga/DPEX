/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.chainofresponsibelity;

/**
 *
 * @author acer
 */
public class Demo {
    
    private static AbstractMessage getChainOfLoggers(){ 

      AbstractMessage errorLogger = new ErrorMessager(AbstractMessage.ERROR);
      AbstractMessage fileLogger = new FileMessager(AbstractMessage.DEBUG);
      AbstractMessage consoleLogger = new ConsoleMessager(AbstractMessage.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }

   public static void main(String[] args) {
      AbstractMessage loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractMessage.INFO, 
         "This is an information.");

      loggerChain.logMessage(AbstractMessage.DEBUG, 
         "This is an debug level information.");

      loggerChain.logMessage(AbstractMessage.ERROR, 
         "This is an error information.");
   }

    
}

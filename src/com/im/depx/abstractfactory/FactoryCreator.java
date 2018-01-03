/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.abstractfactory;

/**
 *
 * @author acer
 */
public class FactoryCreator {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equals("company")) {

            return new CompanyFactory();
        } else if (choice.equals("Salary")) {
            return new SalaryScaleFactory();

        } else {
            return null;

        }

    }

}

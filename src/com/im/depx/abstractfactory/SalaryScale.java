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
public abstract class SalaryScale {

    double rate;

    public abstract double getRate();

    public double calculateSalary(double netSalary) {

        double salary = netSalary + ((netSalary / 25) * getRate());

        return salary;
    }

}

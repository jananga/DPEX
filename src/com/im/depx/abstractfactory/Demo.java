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
public class Demo {

    public static void main(String[] args) {

        AbstractFactory company = FactoryCreator.getFactory("company");

        String companyName = company.getCompany("virtusa").getName();

        System.out.println("Company : " + companyName);

        AbstractFactory salary = FactoryCreator.getFactory("Salary");
        
      //  System.out.println("called : " + companyName);

        double grossSalary = salary.getSalaryScale("clirical").calculateSalary(45000);

        System.out.println("Salary : " + grossSalary);

    }

}

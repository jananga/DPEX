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
public class CompanyFactory extends AbstractFactory {

    @Override
    Company getCompany(String company) {

        if (company.equals("virtusa")) {
            return new Virtusa();

        } else if (company.equals("pearson")) {
            return new Pearson();
        } else if (company.equals("johnkeels")) {

            return new JohnKeels();
        } else {
            return null;
        }
    }

    @Override
    public SalaryScale getSalaryScale(String staff) {
        return null;
    }

}

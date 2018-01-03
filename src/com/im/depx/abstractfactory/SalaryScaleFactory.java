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
public class SalaryScaleFactory extends AbstractFactory {

    @Override
    Company getCompany(String company) {
        return null;

    }

    @Override
    SalaryScale getSalaryScale(String staff) {
        if (staff.equals("clirical")) {
            return new CliricalStaff();
        } else if (staff.equals("executive")) {
            return new ExecutiveStaff();
        } else if (staff.equals("lower")) {
            return new LowerStaff();

        } else {
            return null;
        }
    }

}

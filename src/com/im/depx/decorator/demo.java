/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.decorator;

/**
 *
 * @author acer
 */
public class demo {

    public static void main(String[] args) {

        HeavyVehicle hv = new HeavyVehicle();

        System.out.println(hv.assembleVehicle());
        System.out.println(hv.vehiclePrice());

        LightVehicle lv = new LightVehicle((Vehicle) new HeavyVehicle());

        System.out.println(lv.assembleVehicle());
        System.out.println(lv.vehiclePrice());

       // DualpurposeVehicle dv = new DualpurposeVehicle(lv);

        DualpurposeVehicle dv = new DualpurposeVehicle((Vehicle) new HeavyVehicle());

        System.out.println(dv.assembleVehicle());
        System.out.println(dv.vehiclePrice());

    }

}

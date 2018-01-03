/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.builder;

/**
 *
 * @author acer
 */
public class CDBuilder {

    public CDType buildImationsCD() {
        CDType cds = new CDType();
        cds.addItem(new Imations());

        return cds;
    }

    public CDType buildTransendCD() {
        CDType cds = new CDType();
        cds.addItem(new Transend());

        return cds;
    }

}

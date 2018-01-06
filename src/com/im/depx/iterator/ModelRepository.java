/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.depx.iterator;

/**
 *
 * @author acer
 */
public class ModelRepository implements Container{

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterable getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterable {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
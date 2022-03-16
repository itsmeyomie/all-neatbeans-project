/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.models;

/**
 *
 * @author devyo
 */
public class Person {
    String number;
    String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "number=" + number + ", name=" + name + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Person() {
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Rest.weather.models;

/**
 *
 * @author devyo
 */
public class Main {

    float temp;
    int humidity;

    public Main(float temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Main{" + "temp=" + temp + ", humidity=" + humidity + '}';
    }
    
}

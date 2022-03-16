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
public class Wind {
    float speed;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Wind(float speed) {
        this.speed = speed;
    }

    public Wind() {
    }
    
}

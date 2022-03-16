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
public class Weather {

    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weather(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weather{" + "description=" + description + '}';
    }

    public Weather() {
    }

}

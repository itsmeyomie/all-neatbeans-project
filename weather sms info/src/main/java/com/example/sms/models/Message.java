/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.models;

import com.example.Rest.weather.models.GlobalWeather;
import com.example.sms.services.WeatherService;

/**
 *
 * @author devyo
 */
public class Message {

    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Rest.weather.Interfaces;

import com.example.Rest.weather.models.GlobalWeather;

/**
 *
 * @author devyo
 * @param <T>
 */
public interface IgetWeather<T> {

      public GlobalWeather getWeather(float lat, int lon);
    

}

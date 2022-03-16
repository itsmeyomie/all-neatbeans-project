/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Rest.weather.controller;

import com.example.Rest.weather.Interfaces.IgetWeather;
import com.example.Rest.weather.models.GlobalWeather;
import com.example.Rest.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController
public class WeatherController {
//

    @Autowired
    IgetWeather<WeatherService> igetWeather;

    @GetMapping("/global-weather")
    public ResponseEntity<GlobalWeather> getWeather(@RequestParam float lon, @RequestParam int lat) {
        GlobalWeather globalWeather = igetWeather.getWeather(lon, lat);
        GlobalWeather gb = new GlobalWeather();
        getData();
        return new ResponseEntity(globalWeather, HttpStatus.OK);

    }

    public void getData() {
        GlobalWeather gb = new GlobalWeather();
        System.out.println(gb.getMain().getHumidity());

    }
}

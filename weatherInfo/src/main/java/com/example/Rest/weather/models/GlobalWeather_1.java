/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Rest.weather.models;


import java.util.List;

/**
 *
 * @author devyo
 */
public class GlobalWeather {

    Coordinate coord;

    public GlobalWeather() {
    }

    List<Weather> weather;
    String base;
    Main main;

    

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public GlobalWeather(Coordinate coord, List<Weather> weather, String base, Main main) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
    }

}

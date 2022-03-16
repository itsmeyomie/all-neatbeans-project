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
public class Coordinate {

    float lon;
    int lat;

    public Coordinate() {
    }

    @Override
    public String toString() {
        return "Coordinate{" + "lon=" + lon + ", lat=" + lat + '}';
    }

    public Coordinate(float lon, int lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

}

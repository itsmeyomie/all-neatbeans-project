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
   int id;
   String main;
   String description;
   String icon;
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Weather(int id, String main, String icon) {
        this.id = id;
        this.main = main;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Weather{" + "id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + '}';
    }

    public Weather() {
    }
       
}


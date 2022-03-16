/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.vehicle.controller;

import com.example.vehicle.controller.IVehicleService.IVehicleService;

import com.example.vehicle.models.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController

public class VehicleController {

    @Autowired
    IVehicleService vehicleService;

    @PostMapping("/postCar")
    public String postCar(@RequestBody List<Car> car) {
       List<Car>gt= vehicleService.saveAll(car);
        return "posted cars" + car.size();
    }

    @GetMapping("/getCar")
    public List<Car> getCar() {
        return (List<Car>) vehicleService.findAll();
    }
}

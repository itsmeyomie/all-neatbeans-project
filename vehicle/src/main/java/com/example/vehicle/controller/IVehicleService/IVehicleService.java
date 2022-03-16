/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.vehicle.controller.IVehicleService;


import com.example.vehicle.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author devyo
 */
public interface IVehicleService extends JpaRepository<Car, Long> {    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yomie.Springtest.student;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController
@RequestMapping(path = "/student")
public class studentController {

    service service;
    
   @Autowired
    public studentController(service service) {
        this.service = service;
    }

    @GetMapping
    public ArrayList getStudent() {

        return service.getStudent();

    }

}

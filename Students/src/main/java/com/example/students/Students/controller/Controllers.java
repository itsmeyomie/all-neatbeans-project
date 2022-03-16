/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.students.Students.controller;

import com.example.students.Students.Student.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author devyo
 */
@Controller
@RequestMapping(path = "/Student")

public class Controllers {

    @Autowired
    private repo userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody

    String addNewUser(@RequestBody Student student) {

        userRepository.save(student);

        return "Student created";

    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable< Student> getAllUsers() {

        return userRepository.findAll();

    }
}

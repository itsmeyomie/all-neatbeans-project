/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.students.Students.controller;

import com.example.students.Students.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author devyo
 */
@Repository
public interface repo extends JpaRepository < Student, Long > {
    Student findByName(String name);
}
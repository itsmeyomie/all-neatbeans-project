/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spark.java.demo;
import static spark.Spark.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import spark.Service;

/**
 *
 * @author haamani
 */
public class Init {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service service = new Service();

        // TODO code application logic here
        get("/student", (req, res) -> {
            return objectToJson(service.getStudentsRecord());
        });

        post("/student", (req, res) -> {
            Student student = objectFromJson(req.body());
            System.out.println(student);
            service.createStudent(student);
            return "{\"status\":\"ok\"}";
        });

    }

    private static String objectToJson(ArrayList<Student> students) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.toJson(students);
    }

    private static Student objectFromJson(String jsonString) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Student student = null;

        System.out.println(jsonString);
        try {
            student = gson.fromJson(jsonString, Student.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getLocalizedMessage());
        }

        return student;

    }

}
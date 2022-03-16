/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yomie.Springtest.student;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author devyo
 */
@Service
public class service {

    public ArrayList getStudent() {
        student students = new student("yomie", 21);
        student student1 = new student("grace", 22);
        student student2 = new student("carl", 23);
        student student3 = new student("bill", 24);
        student student4 = new student("kenny", 25);

        ArrayList<student> student = new ArrayList();

        student.add(students);
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        return student;
    }

}

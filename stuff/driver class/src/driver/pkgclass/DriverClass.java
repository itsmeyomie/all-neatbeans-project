/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.pkgclass;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
      Teacher teacher1 = new Teacher("Hashim", "Male");
      
      
        Student student1 = new Student( "Grace", "Female"); //objects
        Student student2 = new Student( "Amani", "Female");
        Student student3 = new Student( "Joy", "Female");
        Student student4 = new Student( "David", "male");
        Student student5 = new Student( "Kelly", "Female");
        Student student6 = new Student( "Billy", "Male");
        
        teacher1.setStudentMarks(student1, 40);
        teacher1.setStudentMarks(student2, 50);
        teacher1.setStudentMarks(student3, 60);
        teacher1.setStudentMarks(student4, 66);
        teacher1.setStudentMarks(student5, 30);
        teacher1.setStudentMarks(student6, 87);

         
       
        
        Student arr[] = new Student[6];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
        arr[3] = student4;
        arr[4] = student5;
        arr[5] = student6;
       
        ComputeGrade computeGrade = new ComputeGrade();
        ComputePromotion computePromotion = new ComputePromotion();

        for (Student currentStudent : arr) {

            int currentMarks = currentStudent.getMarks();

            computeGrade.setMarks(currentMarks);
            computePromotion.setMarks(currentMarks);

         
        
            
            teacher1.setStudentGRade(currentStudent,computeGrade.getGrade());
            teacher1.setStudentPromotion(currentStudent,computePromotion.getPromotion());
            
            char currentGrade=currentStudent.getGrade();
            String currentPromotion=currentStudent.getPromotion();
            
            System.out.println("Student : " + currentStudent.getName() + " Marks is: " + currentMarks);
            System.out.println("Student : " + currentStudent.getName() + " Grade is: " + currentGrade);
            System.out.println("Student : " + currentStudent.getName() + " Promotion is: " + currentPromotion);
        }

    }

}

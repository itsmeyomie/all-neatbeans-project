/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.pkgclass;

public class DriverClass {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Hashim", "Male", "Maths");
        Teacher teacher2 = new Teacher("Mwinyi", "Male", "English");

        Student student1 = new Student("Grace", "Female"); //objects
        Student student2 = new Student("Amani", "Female");
        Student student3 = new Student("Joy", "Female");
        Student student4 = new Student("David", "male");
        Student student5 = new Student("Kelly", "Female");
        Student student6 = new Student("Billy", "Male");
        Student student7 = new Student("Jane", "Female");
        Student student8 = new Student("kim", "male");
        Student student9 = new Student("Brad", "Male");
        Student student10 = new Student("Abdalla", "Male");

        teacher1.setStudentMarks(student1, 40);
        teacher1.setStudentMarks(student2, 50);
        teacher1.setStudentMarks(student3, 60);
        teacher1.setStudentMarks(student4, 66);
        teacher1.setStudentMarks(student5, 30);
        teacher2.setStudentMarks(student6, 87);
        teacher2.setStudentMarks(student7, 53);
        teacher2.setStudentMarks(student8, 75);
        teacher2.setStudentMarks(student9, 90);
        teacher2.setStudentMarks(student10, 47);

        Student arr[] = new Student[10];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
        arr[3] = student4;
        arr[4] = student5;
        arr[5] = student6;
        arr[6] = student7;
        arr[7] = student8;
        arr[8] = student9;
        arr[9] = student10;

        ComputeGrade computeGrade = new ComputeGrade();
        ComputePromotion computePromotion = new ComputePromotion();

        System.out.println(teacher1.getName() + " " + teacher1.getGender() + " " + teacher1.getSubject() + " teacher");
        System.out.println(teacher2.getName() + " " + teacher2.getGender() + " " + teacher2.getSubject() + " teacher");
        System.out.println("---------------------------");

        int i = 1;
        for (Student currentStudent : arr) {

            int currentMarks = currentStudent.getMarks();

            computeGrade.setMarks(currentMarks);
            computePromotion.setMarks(currentMarks);

            if (i <= 5) {
                teacher1.setStudentGRade(currentStudent, computeGrade.getGrade());
                teacher1.setStudentPromotion(currentStudent, computePromotion.getPromotion());
                teacher1.setStudentSubject(currentStudent);
            } else {
                teacher2.setStudentGRade(currentStudent, computeGrade.getGrade());
                teacher2.setStudentPromotion(currentStudent, computePromotion.getPromotion());
                teacher2.setStudentSubject(currentStudent);
            }
            i++;

            char currentGrade = currentStudent.getGrade();
            String currentPromotion = currentStudent.getPromotion();
            String currentSubject = currentStudent.getSubject();

            System.out.println("Student : " + currentStudent.getName() + " Subject is: " + currentSubject);
            System.out.println("Student : " + currentStudent.getName() + " Marks is: " + currentMarks);
            System.out.println("Student : " + currentStudent.getName() + " Grade is: " + currentGrade);
            System.out.println("Student : " + currentStudent.getName() + " Promotion is: " + currentPromotion);

        }

    }
}

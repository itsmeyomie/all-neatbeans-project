/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.ArrayList;

public class DriverClass {

    public static void main(String[] args) {

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
        Student student11 = new Student("Buti", "Male");
        Student student12 = new Student("Bancy", "Female");

        student1.setMarks(40);
        student2.setMarks(80);
        student3.setMarks(50);
        student4.setMarks(30);
        student5.setMarks(41);
        student6.setMarks(25);
        student7.setMarks(66);
        student8.setMarks(37);
        student9.setMarks(34);
        student10.setMarks(80);
        student11.setMarks(87);
        student12.setMarks(83);

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);

        ArrayList<Student> mathStudents = new ArrayList<>();
        ArrayList<Student> englishStudents = new ArrayList<>();
        ArrayList<Student> kiswahiliStudents = new ArrayList<>();

        for (int i = 0; i < studentList.size(); i++) {
            Student currentStudent = studentList.get(i);
            if (i < 5) {
                mathStudents.add(currentStudent); //teacher 1an2 add to array list

            } else if (i > 4 && i < 10) {
                englishStudents.add(currentStudent);
            } else {
                kiswahiliStudents.add(currentStudent);
            } 
                             //kubai airtel 0735484301
        }

        Teacher teacher1 = new Teacher("Hashim", "Male", "Maths", mathStudents);
        Teacher teacher2 = new Teacher("Mwinyi", "Male", "English", englishStudents);
        Teacher teacher3 = new Teacher("Esher", "Female", "Kiswahili", kiswahiliStudents);

        Human teacher4 = new Teacher("Abstract teacher", "Female", "Kiswahili", kiswahiliStudents);
        Human student13 = new Student("abstract student", "Female");

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(teacher4);
        humanList.add(student13);
        humanList.add(teacher3);
        
        for (Human currentTeacher:humanList) {
            currentTeacher.attendance();
        }
        

        ArrayList<Teacher> teachersList = new ArrayList<>();
                teachersList.add(teacher1);
                teachersList.add(teacher2);
                teachersList.add(teacher3);
        
                for (Teacher currentTeacher : teachersList) {
        
                    currentTeacher.getStudentReport();
                    System.out.println(currentTeacher.getStudentsFailedReports());
        
                }
        {

        }
    }
}

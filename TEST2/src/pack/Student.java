/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author devyo
 */
public class Student extends Human {

    private int marks;
    private char grade;
    private String promotion;

    public Student(String name, String gender) {
        super(name, gender);

    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + marks + ", grade=" + grade + ", promotion=" + promotion + '}';
    }

    @Override
    protected void attendance() {
        System.out.printf("Student %s attending class",this.getName());
     
    }

}

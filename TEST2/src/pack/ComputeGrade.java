/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

public class ComputeGrade extends Computer {

    public char getGrade() {
        return this.computeGrade(marks);
    }

    private char computeGrade(int marks) {
        char grade;
        if (marks >= 70 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'B';
        } else if (marks >= 50 && marks <= 59) {
            grade = 'C';
        } else if (marks >= 40 && marks <= 49) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        return grade;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.pkgclass;

public class Teacher extends Human {

    public Teacher(String name, String gender) {
        super(name, gender);
    }

    public void setStudentMarks(Student student, int marks) {
        student.setMarks(marks);
    }

    public void setStudentGRade(Student student, char grade) {
        student.setGrade(grade);
    }

    public void setStudentPromotion(Student student, String promotion) {
        student.setPromotion(promotion);
    }
}

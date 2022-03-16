
package driver.pkgclass;

public class Teacher extends Human {
    
    
    public Teacher(String name, String gender,String subject) {
        super(name, gender);
        this.subject = subject;
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
    
     public void setStudentSubject(Student student) {
        student.setSubject(subject);
    }
   
}

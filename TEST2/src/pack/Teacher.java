 package pack;

import java.util.ArrayList;

public class Teacher extends Human {

    ArrayList<Student> studentList;

    public Teacher(String name, String gender, String subject, ArrayList<Student> studentList) {
        super(name, gender);
        this.subject = subject;
        this.studentList = studentList;
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

    public void getStudentReport() {

        ComputeGrade computeGrade = new ComputeGrade();
        ComputePromotion computePromotion = new ComputePromotion();

        System.out.println(this.getName() + " " + this.getGender() + " " + this.getSubject() + " teacher");

        for (Student currentStudent : studentList) {

            int currentMarks = currentStudent.getMarks();

            computeGrade.setMarks(currentMarks);
            computePromotion.setMarks(currentMarks);

            setStudentGRade(currentStudent, computeGrade.getGrade());
            setStudentPromotion(currentStudent, computePromotion.getPromotion());
            setStudentSubject(currentStudent);

            char currentGrade = currentStudent.getGrade();
            String currentPromotion = currentStudent.getPromotion();
            String currentSubject = currentStudent.getSubject();

            System.out.println("Student : " + currentStudent.getName() + " Subject is: " + currentSubject);
            System.out.println("Student : " + currentStudent.getName() + " Marks is: " + currentMarks);
            System.out.println("Student : " + currentStudent.getName() + " Grade is: " + currentGrade);
            System.out.println("Student : " + currentStudent.getName() + " Promotion is: " + currentPromotion);

        }

    }

    public ArrayList<Student> getStudentsFailedReports() {
        ArrayList<Student> failStudents = new ArrayList<>();

        for (int i = 0; i < studentList.size(); i++) {
            Student currentStudent = studentList.get(i);

            if (currentStudent.getMarks() < (40)) {
                failStudents.add(currentStudent);
            }
        }
        return failStudents;
    }

    @Override
    protected void attendance() {
        System.out.printf("Teacher %s attending class", this.getName());
    }

}

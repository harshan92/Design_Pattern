package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        StudentBO studentBusinessObect=new StudentBO();

        for(StudentVO student:studentBusinessObect.getAllStudents()){
            System.out.println("Student : { RollNo: "+student.getRollNo()+", Name: "+student.getName()+" }");
        }

        StudentVO student=studentBusinessObect.getAllStudents().get(0);
        student.setName("Derek");
        studentBusinessObect.updateStudent(student);

        student=studentBusinessObect.getStudent(0);
        System.out.println("Student : { RollNo: "+student.getRollNo()+", Name: "+student.getName()+" }");
    }
}
package com.harshan92;

import com.oracle.webservices.internal.api.EnvelopeStyle.Style;

public class Demo {
    public static void main(String[] args) {
        StudentDAO studentDao=new StudentDAOImpl();

        for(Student student: studentDao.getAllStudents()){
            System.out.println("Student: [ RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");
        }

        Student student=studentDao.getAllStudents().get(0);
        student.setName("David");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student: [ RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");

        // for(Student student2: studentDao.getAllStudents()){
        //     System.out.println("Student: [ RollNo: "+student2.getRollNo()+", Name: "+student2.getName()+"]");
        // }
    }
}
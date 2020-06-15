package com.harshan92;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    List<StudentVO> students;
     
    public StudentBO(){
        students=new ArrayList<StudentVO>();
        StudentVO student1=new StudentVO("Mike",0);
        StudentVO student2=new StudentVO("Edward",1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student){
        students.remove(student);
        System.out.println("Student: { RollNo: "+student.getRollNo()+", Name: "+student.getName()+" }");
    }

    public List<StudentVO> getAllStudents(){
        return students;
    }

    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: { RollNo: "+student.getRollNo()+", Name: "+student.getName()+" }, updated!");
    }
}
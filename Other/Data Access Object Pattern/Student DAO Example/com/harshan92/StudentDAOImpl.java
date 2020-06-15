package com.harshan92;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    List<Student> students;

    public StudentDAOImpl(){
        students=new ArrayList<Student>();
        Student student1=new Student("John", 1);
        Student student2=new Student("Billy", 0);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: "+student.getRollNo()+", updated!");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: "+student.getRollNo()+", deleted!");
    }
    
}
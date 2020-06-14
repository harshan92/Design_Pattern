package com.harshan92;

public class StudentController {
    private Student modal;
    private StudentView view;

    public StudentController(Student student, StudentView studentView){
        this.modal=student;
        this.view=studentView;
    }

    public void setStudentName(String name){
        modal.setName(name);
    }

    public String getStudentName(){
        return modal.getName();
    }

    public void setStudentRollNo(String rollNo){
        modal.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return modal.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(modal.getName(), modal.getRollNo());
    }
}
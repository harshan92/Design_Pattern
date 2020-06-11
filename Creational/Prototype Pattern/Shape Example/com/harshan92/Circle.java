package com.harshan92;

public class Circle extends Shape{

    public Circle(){
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Draw the circle.");
    }
    
}
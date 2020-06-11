package com.harshan92;

public class Square extends Shape{

    public Square(){
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("Draw the square.");
    }
    
}
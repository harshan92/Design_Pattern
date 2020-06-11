package com.harshan92;

public class Rectangle extends Shape{

    public Rectangle(){
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw the rectangle.");
    }
    
}
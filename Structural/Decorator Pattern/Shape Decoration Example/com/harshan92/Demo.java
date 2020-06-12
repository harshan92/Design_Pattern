package com.harshan92;

public class Demo {
    
    public static void main(String[] args) {
        Shape circle=new Circle();

        Shape redCircle=new RedShapeDecorator(circle);

        Shape redRectangle=new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with a red border");
        redCircle.draw();

        System.out.println("Rectangle with a red border");
        redRectangle.draw();
    }
}
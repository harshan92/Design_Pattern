package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        Image image=new ProxyImage("test_image.jpg");

        image.display();

        image.display();
    }
}
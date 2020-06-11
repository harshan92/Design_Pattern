package com.harshan92;

public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle[ color: red; raius: "+radius+", x: "+x+", y: "+y+"]");
    }
    
}
package com.harshan92;

public class GreenCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle[ color: greeen; raius: "+radius+", x: "+x+", y: "+y+"]");
    }
    
}
package com.harshan92;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        Shape myShape=null;
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            myShape=new Circle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            myShape=new Square();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            myShape=new Rectangle();
        }
        return myShape;
    }
}
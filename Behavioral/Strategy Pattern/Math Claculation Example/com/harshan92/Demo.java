package com.harshan92;

public class Demo{
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("21 + 5 = "+context.executeStrategy(21, 5));

        context=new Context(new OperationSubstract());
        System.out.println("21 - 5 = "+context.executeStrategy(21, 5));

        context=new Context(new OperationMultiply());
        System.out.println("21 * 5 = "+context.executeStrategy(21, 5));
    }
}
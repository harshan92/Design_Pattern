package com.harshan92;

public class Demo {

    private static Expression getMaleExpression(){
        Expression john=new TerminalExpression("John");
        Expression david=new TerminalExpression("David");
        return new OrExpression(john, david);
    }

    private static Expression getMarriedWomanExpression(){
        Expression emily=new TerminalExpression("Emily");
        Expression married=new TerminalExpression("Married");
        return new AndExpression(emily, married);
    }

    public static void main(String[] args) {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedWomanExpression();

        System.out.println("John is male? "+isMale.interpret("John"));
        System.out.println("Emily is a married woman? "+isMarriedWoman.interpret("Emily Married"));
    }
}
package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        User harshan=new User("Harshan");
        User john=new User("John");

        harshan.sendMessage("Hi");
        john.sendMessage("Howdy!");
        harshan.sendMessage("Where are you from?");
    }
}
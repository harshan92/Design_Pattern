package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        AbstractCustomer customer1=CustomerFactory.getCustomer("Mahe");
        AbstractCustomer customer2=CustomerFactory.getCustomer("Boa");
        AbstractCustomer customer3=CustomerFactory.getCustomer("Jimi");
        AbstractCustomer customer4=CustomerFactory.getCustomer("Nail");

        System.out.println("Customer");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        Client client=new Client();
        client.setData("Test data1", "Test data2");
        client.printData();
        client.setData("value1", "value2");
        client.printData();
    }
}
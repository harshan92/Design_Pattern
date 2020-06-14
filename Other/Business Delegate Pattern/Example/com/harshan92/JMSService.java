package com.harshan92;

public class JMSService implements BusinessService{

    @Override
    public void doProcessing() {
        System.out.println("Business task by invoking JMS service");
    }
    
}
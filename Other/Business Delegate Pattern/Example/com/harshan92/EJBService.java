package com.harshan92;

public class EJBService implements BusinessService{

    @Override
    public void doProcessing() {
        System.out.println("Business task by invoking EJB service");
    }
    
}
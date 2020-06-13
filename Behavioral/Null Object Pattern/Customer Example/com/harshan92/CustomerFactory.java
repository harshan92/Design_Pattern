package com.harshan92;

public class CustomerFactory {
    public static final String[] names={"Mike", "Perera", "Jimi"};

    public static AbstractCustomer getCustomer(String name){
        for(int i=0; i<names.length; i++){
            if(names[i].equals(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
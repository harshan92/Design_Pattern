package com.harshan92;

public class CoarseGrainedObject {
    DependantObject1 object1=new DependantObject1();
    DependantObject2 object2=new DependantObject2();

    public void setData(String data1, String data2){
        object1.setData(data1);
        object2.setData(data2);
    }

    public String[] getData(){
        return new String[]{object1.getData(), object2.getData()};
    }
}
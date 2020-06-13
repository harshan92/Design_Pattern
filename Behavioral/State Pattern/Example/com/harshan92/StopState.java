package com.harshan92;

public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Play is in stop state");
        context.setState(this);
    }
    
    public String toString(){
        return "Stop state";
    }
}
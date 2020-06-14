package com.harshan92;

public class Cricket extends Game{

    @Override
    public void initialize() {
        System.out.println("Cricket game initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game started.");
    }

    @Override
    public void stopPlay() {
        System.out.println("Cricket game Finished.");
    }
    
}
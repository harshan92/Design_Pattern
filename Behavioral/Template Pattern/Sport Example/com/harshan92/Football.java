package com.harshan92;

public class Football extends Game{

    @Override
    public void initialize() {
        System.out.println("Football game initialized!. Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game started.");
    }

    @Override
    public void stopPlay() {
        System.out.println("Football game finished.");
    }
    
}
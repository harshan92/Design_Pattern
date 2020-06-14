package com.harshan92;

public abstract class Game{
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void stopPlay();
    public void play(){
        initialize();
        startPlay();
        stopPlay();
    }
}
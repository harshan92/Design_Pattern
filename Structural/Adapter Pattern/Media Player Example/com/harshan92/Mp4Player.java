package com.harshan92;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        // nothing

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. File name : "+fileName);
    }
    
}
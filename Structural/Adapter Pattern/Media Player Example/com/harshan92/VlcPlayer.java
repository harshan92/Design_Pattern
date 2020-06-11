package com.harshan92;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. File name :"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // nothing
    }
    
}
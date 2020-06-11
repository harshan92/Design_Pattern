package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();

        audioPlayer.play("mp3", "Passenger - Let her go.mp3");
        audioPlayer.play("mp4", "clip.mp4");
        audioPlayer.play("vlc", "Girl like you.vlc");
        audioPlayer.play("wmv", "unnamed.wmv");
    }
}
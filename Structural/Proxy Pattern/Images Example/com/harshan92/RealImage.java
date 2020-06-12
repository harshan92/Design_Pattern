package com.harshan92;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String filename){
        this.fileName=filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+fileName);

    }
    
    private void loadFromDisk(String filename){
        System.out.println("Loading "+filename);
    }
}
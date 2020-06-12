package com.harshan92;

public class ProxyImage implements Image{
    private RealImage realImage;
    private final String filename;

    public ProxyImage(final String filename) {
        this.filename=filename;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(filename);
        }

        realImage.display();
    }


}
package com.harshan92;

public class SellStock implements Order{

    private Stock stck;

    public SellStock(Stock stck){
        this.stck=stck;
    }

    @Override
    public void execute() {
        stck.sell();
    }
    
}
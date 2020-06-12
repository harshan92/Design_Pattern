package com.harshan92;

public class BuyStock implements Order{

    private Stock stck;

    public BuyStock(Stock stck){
        this.stck=stck;
    }

    @Override
    public void execute() {
        stck.buy();
    }
    
}
package com.harshan92;

public class Demo {
    public static void main(String[] args) {
        Stock stck=new Stock();

        BuyStock buyStockOrder=new BuyStock(stck);
        SellStock sellStockOrder=new SellStock(stck);

        Broker broker=new Broker();
        broker.takeOrders(buyStockOrder);
        broker.takeOrders(sellStockOrder);

        broker.placeOrders();
    }
}
package com.example.test;

import com.example.stock.*;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("App1");
        Observer mobileApp2 = new MobileApp("App2");
        Observer webApp1 = new WebApp("Web1");

        stockMarket.registerObserver((java.util.Observer) mobileApp1);
        stockMarket.registerObserver((java.util.Observer) mobileApp2);
        stockMarket.registerObserver((java.util.Observer) webApp1);

        stockMarket.setPrice(100.0);
        System.out.println();

        stockMarket.removeObserver((java.util.Observer) mobileApp1);
        stockMarket.setPrice(150.0);
    }
}

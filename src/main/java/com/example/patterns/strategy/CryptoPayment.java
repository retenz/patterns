package com.example.patterns.strategy;

public class CryptoPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Оплата криптой");
    }
}

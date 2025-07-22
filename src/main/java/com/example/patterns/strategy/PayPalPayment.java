package com.example.patterns.strategy;

public class PayPalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Оплата через пэй пал");
    }
}

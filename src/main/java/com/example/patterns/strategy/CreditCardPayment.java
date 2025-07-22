package com.example.patterns.strategy;

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Оплата кредиткой");
    }
}

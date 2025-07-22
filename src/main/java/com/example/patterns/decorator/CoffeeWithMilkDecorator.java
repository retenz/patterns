package com.example.patterns.decorator;

public class CoffeeWithMilkDecorator extends CoffeeDecorator {

    public CoffeeWithMilkDecorator(Coffee coffee) {
        super(coffee, 100);
    }
}

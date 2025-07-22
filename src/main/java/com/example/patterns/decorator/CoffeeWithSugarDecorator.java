package com.example.patterns.decorator;

public class CoffeeWithSugarDecorator extends CoffeeDecorator {
    public CoffeeWithSugarDecorator(Coffee coffee) {
        super(coffee, 50);
    }
}

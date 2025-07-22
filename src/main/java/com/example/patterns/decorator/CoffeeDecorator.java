package com.example.patterns.decorator;

abstract public class CoffeeDecorator extends Coffee {
    Coffee drink;
    int cost;

    public CoffeeDecorator(Coffee coffee, int cost) {
        this.drink = coffee;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return drink.getCost() + this.cost;
    }
}

package com.example.patterns.templateMethod;

public class CoffeeCreator extends DrinkCreator {
    @Override
    protected void addDrink() {
        System.out.println("Добавляем кофе в воду");
    }

    @Override
    protected void addSugar() {
        System.out.println("Без сахара");
    }
}

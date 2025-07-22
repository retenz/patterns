package com.example.patterns.templateMethod;

public class TeaCreator extends DrinkCreator {
    @Override
    protected void addDrink() {
        System.out.println("Добавляем пакетик чая");
    }

    @Override
    protected void addSugar() {
        System.out.println("Добавляем 2 ложки сахара");
    }
}

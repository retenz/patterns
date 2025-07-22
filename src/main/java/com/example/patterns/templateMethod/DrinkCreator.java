package com.example.patterns.templateMethod;

public abstract class DrinkCreator {
    public void create() {
        addWater();
        addDrink();
        addSugar();
    }

    private void addWater() {
        System.out.println("Добавляем воду");
    }

    protected abstract void addDrink();
    protected abstract void addSugar();

}

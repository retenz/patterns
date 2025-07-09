package com.example.patterns.builder.builders;

import com.example.patterns.builder.domain.Pizza;

public class PizzaBuilder {
    private String cheese;
    private String tomato;
    private String mushroom;

    public PizzaBuilder addCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder addTomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public PizzaBuilder addMushroom(String mushroom) {
        this.mushroom = mushroom;
        return this;
    }

    public Pizza build() {
        return new Pizza(cheese, tomato, mushroom);
    }
}

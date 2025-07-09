package com.example.patterns.builder.domain;

import com.example.patterns.builder.builders.PizzaBuilder;
import lombok.Data;

@Data
public class Pizza {
    public String cheese;
    public String tomato;
    public String mushroom;

    public Pizza() {}

    public Pizza(String cheese, String tomato, String mushroom) {
        this.cheese = cheese;
        this.tomato = tomato;
        this.mushroom = mushroom;
    }

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.cheese = pizzaBuilder.cheese;
        this.tomato = pizzaBuilder.tomato;
        this.mushroom = pizzaBuilder.mushroom;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", tomato='" + tomato + '\'' +
                ", mushroom='" + mushroom + '\'' +
                '}';
    }

    public static class PizzaBuilder {
        public String cheese;
        public String tomato;
        public String mushroom;

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
            return new Pizza(this);
        }
    }
}

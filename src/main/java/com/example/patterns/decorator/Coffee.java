package com.example.patterns.decorator;

import lombok.Data;

@Data
public class Coffee implements Drink {
    private int cost;

    public Coffee(){}

    public Coffee(int cost) {
        this.cost = cost;
    }
}

package com.example.patterns.prototype;


import lombok.Data;

@Data
public abstract class Shape {
    private int x;
    private int y;

    public Shape() {}

    public Shape(Shape shape) {
        this.x = shape.getX();
        this.y = shape.getY();
    }

    public abstract Shape clone();
}

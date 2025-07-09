package com.example.patterns.prototype;

import lombok.Data;

@Data
public class Circle extends Shape{
    private int radius;

    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.getRadius();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

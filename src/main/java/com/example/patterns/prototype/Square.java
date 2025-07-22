package com.example.patterns.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;

//@EqualsAndHashCode(callSuper = true)
@Data
public class Square extends Shape {
    public int perimetr;

    public Square() {}

    public Square(Square square) {
        super(square);
        this.perimetr = square.getPerimetr();
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}

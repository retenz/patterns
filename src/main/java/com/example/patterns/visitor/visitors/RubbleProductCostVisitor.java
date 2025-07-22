package com.example.patterns.visitor.visitors;

import com.example.patterns.visitor.Book;
import com.example.patterns.visitor.Fruit;

public class RubbleProductCostVisitor implements ProductCostVisitor {
    @Override
    public int getCost(Book book) {
        return 100;
    }

    @Override
    public int getCost(Fruit fruit) {
        return 150;
    }
}

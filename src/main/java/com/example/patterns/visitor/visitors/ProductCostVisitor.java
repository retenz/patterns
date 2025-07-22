package com.example.patterns.visitor.visitors;

import com.example.patterns.visitor.Book;
import com.example.patterns.visitor.Fruit;

public interface ProductCostVisitor {
    public int getCost(Book book);

    public int getCost(Fruit fruit);
}

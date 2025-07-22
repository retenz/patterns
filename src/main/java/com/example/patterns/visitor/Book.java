package com.example.patterns.visitor;

import com.example.patterns.visitor.visitors.ProductCostVisitor;

public class Book implements Product {
    public int getCost(ProductCostVisitor visitor) {
        return visitor.getCost(this);
    }
}

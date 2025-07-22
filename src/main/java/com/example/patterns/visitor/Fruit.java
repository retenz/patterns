package com.example.patterns.visitor;

import com.example.patterns.visitor.visitors.ProductCostVisitor;

public class Fruit implements Product {
    @Override
    public int getCost(ProductCostVisitor visitor) {
        return visitor.getCost(this);
    }
}

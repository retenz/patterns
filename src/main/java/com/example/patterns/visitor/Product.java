package com.example.patterns.visitor;

import com.example.patterns.visitor.visitors.ProductCostVisitor;

public interface Product {
    public int getCost(ProductCostVisitor visitor);
}

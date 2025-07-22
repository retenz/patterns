package com.example.patterns.visitor;

import com.example.patterns.visitor.visitors.ProductCostVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart implements Product{
    public List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>(List.of(new Fruit(), new Book()));
    }

    public void addProduct(Product product) {
        products.add(product);
    }


    @Override
    public int getCost(ProductCostVisitor visitor) {
        int totalSum = 0;
        for (Product product : products) {
            totalSum += product.getCost(visitor);
        }
        return totalSum;
    }
}

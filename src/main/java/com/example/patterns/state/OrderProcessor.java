package com.example.patterns.state;

import com.example.patterns.state.orders.Order;
import lombok.Data;

@Data
public class OrderProcessor {
    private Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public void getNextOrderStatus() {
        order.getNextOrderStatus(this);
    }

    public void getPreviousOrderStatus() {
        order.getPreviousOrderStatus(this);
    }

    public void printOrderStatus() {
        System.out.println(order.getOrderStatus().getName());
    }
}

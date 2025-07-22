package com.example.patterns.state.orders;

import com.example.patterns.state.OrderProcessor;
import com.example.patterns.state.OrderStatus;

import static com.example.patterns.state.OrderStatus.DELIVERED;

public class DeliveredOrder implements Order {
    @Override
    public OrderStatus getOrderStatus() {
        return DELIVERED;
    }

    @Override
    public void getNextOrderStatus(OrderProcessor orderProcessor) {
        System.out.println("Следующего состояние нет!");
    }

    @Override
    public void getPreviousOrderStatus(OrderProcessor orderProcessor) {
        orderProcessor.setOrder(new ShippedOrder());
    }
}

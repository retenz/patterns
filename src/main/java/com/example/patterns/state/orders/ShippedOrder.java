package com.example.patterns.state.orders;

import com.example.patterns.state.OrderProcessor;
import com.example.patterns.state.OrderStatus;

import static com.example.patterns.state.OrderStatus.SHIPPED;

public class ShippedOrder implements Order {
    @Override
    public OrderStatus getOrderStatus() {
        return SHIPPED;
    }

    @Override
    public void getNextOrderStatus(OrderProcessor orderProcessor) {
        orderProcessor.setOrder(new DeliveredOrder());
    }

    @Override
    public void getPreviousOrderStatus(OrderProcessor orderProcessor) {
        orderProcessor.setOrder(new NewOrder());
    }
}

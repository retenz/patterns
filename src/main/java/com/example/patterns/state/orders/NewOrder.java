package com.example.patterns.state.orders;

import com.example.patterns.state.OrderProcessor;
import com.example.patterns.state.OrderStatus;

import static com.example.patterns.state.OrderStatus.NEW;

public class NewOrder implements Order {
    @Override
    public OrderStatus getOrderStatus() {
        return NEW;
    }

    @Override
    public void getNextOrderStatus(OrderProcessor orderProcessor) {
        orderProcessor.setOrder(new ShippedOrder());
    }

    @Override
    public void getPreviousOrderStatus(OrderProcessor orderProcessor) {
        System.out.println("Предыдущего состояния нет!");
    }
}

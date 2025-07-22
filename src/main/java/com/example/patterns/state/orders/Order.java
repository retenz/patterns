package com.example.patterns.state.orders;

import com.example.patterns.state.OrderProcessor;
import com.example.patterns.state.OrderStatus;

public interface Order {
    public OrderStatus getOrderStatus();
    public void getNextOrderStatus(OrderProcessor orderProcessor);
    public void getPreviousOrderStatus(OrderProcessor orderProcessor);
}

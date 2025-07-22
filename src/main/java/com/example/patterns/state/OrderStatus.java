package com.example.patterns.state;

import lombok.Data;
import lombok.Getter;


@Getter
public enum OrderStatus {
    NEW("Новый"), SHIPPED("Отправлен"), DELIVERED("Доставлен");

    private final String name;
    OrderStatus(String name) {
        this.name = name;
    }

}

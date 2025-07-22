package com.example.patterns.composite;

import lombok.Data;

@Data
abstract public class Item {
    public void addItem(Item item) {
        System.out.println("Сюда нельзя добавлять файл");
    }

    public int getSize() {
        throw new UnsupportedOperationException();
    }
}

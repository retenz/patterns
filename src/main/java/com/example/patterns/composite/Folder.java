package com.example.patterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Folder extends Item {
    private List<Item> items = new ArrayList<>();
    @Override
    public int getSize() {
        return items.stream().mapToInt(Item::getSize).sum();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }
}

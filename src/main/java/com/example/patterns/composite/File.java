package com.example.patterns.composite;

import lombok.Data;

@Data
public class File extends Item {
    @Override
    public int getSize() {
        return 1;
    }
}

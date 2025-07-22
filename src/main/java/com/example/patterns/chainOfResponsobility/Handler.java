package com.example.patterns.chainOfResponsobility;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Handler {
    Handler nextHandler;

    protected abstract void doJob();
    public void handle() {
        doJob();
        if (nextHandler != null) {
            nextHandler.handle();
        }
    }
}

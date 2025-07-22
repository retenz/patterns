package com.example.patterns.chainOfResponsobility;

public class LoggingHandler extends Handler {

    public LoggingHandler() {
        this.nextHandler = new AuthorizationHandler();
    }

    @Override
    protected void doJob() {
        System.out.println("Логирование");
    }
}

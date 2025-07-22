package com.example.patterns.chainOfResponsobility;

public class AuthorizationHandler extends Handler {

    public AuthorizationHandler() {
        this.nextHandler = new AuthenticationHandler();
    }

    @Override
    protected void doJob() {
        System.out.println("Авторизация");
    }
}

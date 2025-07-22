package com.example.patterns.chainOfResponsobility;

public class AuthenticationHandler extends Handler {
    @Override
    protected void doJob() {
        System.out.println("Аутентификация!");
    }
}

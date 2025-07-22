package com.example.patterns.observer;

public class NewsChannel implements Channel{
    @Override
    public void update(String news) {
        System.out.println(news);
    }
}

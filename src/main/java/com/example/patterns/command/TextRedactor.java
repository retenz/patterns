package com.example.patterns.command;

public class TextRedactor {
    public void copy() {
        System.out.println("Копируем");
    }
    public void paste() {
        System.out.println("Вставляем");
    }
    public void undo() {
        System.out.println("Отменяем");
    }
}

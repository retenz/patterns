package com.example.patterns.command;

public class UndoCommand implements Command {
    TextRedactor textRedactor;

    public UndoCommand(TextRedactor textRedactor) {
        this.textRedactor = textRedactor;
    }

    @Override
    public void execute() {
        textRedactor.undo();
    }
}

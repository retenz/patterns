package com.example.patterns.command;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CopyCommand implements Command {
    TextRedactor textRedactor;

    public CopyCommand(TextRedactor textRedactor) {
        this.textRedactor = textRedactor;
    }

    @Override
    public void execute() {
        textRedactor.copy();
    }
}

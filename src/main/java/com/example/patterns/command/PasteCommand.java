package com.example.patterns.command;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PasteCommand implements Command {
    TextRedactor textRedactor;

    public PasteCommand(TextRedactor textRedactor) {
        this.textRedactor = textRedactor;
    }

    @Override
    public void execute() {
        textRedactor.paste();
    }
}

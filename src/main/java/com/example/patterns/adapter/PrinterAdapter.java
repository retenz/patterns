package com.example.patterns.adapter;

public class PrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }
    @Override
    public void printDocument(String document) {
        legacyPrinter.print(document);
    }
}

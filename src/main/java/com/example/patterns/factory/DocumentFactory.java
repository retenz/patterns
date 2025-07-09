package com.example.patterns.factory;

import com.example.patterns.factory.documents.*;
import com.example.patterns.factory.classifier.DocumentType;

public class DocumentFactory {

//        Чтобы добавить новый документ в фабрику:
//            1. Добавить в enum новое значение
//            2. Добавить новый документ и унаследовать его от интерфейса (в данном случае Document)
//            3. Дописать в switch создание нового документа
    public Document createDocument(DocumentType documentType) {
        return switch (documentType) {
            case PDF -> new PDFDocument();
            case WORD -> new WordDocument();
            case EXCEL -> new ExcelDocument();
            case TXT -> new TxtDocument();
            default -> {
                System.out.println("Неизвестный документ");
                yield null;
            }
        };
    }
}

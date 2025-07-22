package com.example.patterns.proxy;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageProxy extends File {
    private final Image image = new Image();
    private BufferedImage imageFileCash = null;


    @Override
    public BufferedImage readFile() {
        if (imageFileCash == null) {
            imageFileCash = image.readFile();
        }
        return imageFileCash;
    }

    public void clearCash() {
        imageFileCash = null;
    }
}

package com.example.patterns.proxy;

import java.awt.image.BufferedImage;
import java.io.IOException;

abstract public class File {
    public abstract BufferedImage readFile();
    public void clearCash() {};
}

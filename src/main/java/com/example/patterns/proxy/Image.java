package com.example.patterns.proxy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Image extends File {
    @Override
    public BufferedImage readFile() {
        try {
            return ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/image/img.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.hotmail.huzy8080.library_hu.Pattern.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("Loading "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }
}

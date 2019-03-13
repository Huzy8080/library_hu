package com.hotmail.huzy8080.library_hu.Pattern.proxy;

public class Client {
    public static void main(String[] args) {
        Image image=new ProxyImage();
        image.display();
    }
}

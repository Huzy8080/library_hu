package com.hotmail.huzy8080.library_hu.设计模式.代理模式;

public class Client {
    public static void main(String[] args) {
        Image image=new ProxyImage();
        image.display();
    }
}

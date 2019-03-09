package com.hotmail.huzy8080.library_hu.设计模式.代理模式;

public class ProxyImage implements Image {
    Image realImage;
    @Override
    public void display() {
        System.out.println("我代理了RealImage...");
        if(realImage==null){
            realImage=new RealImage("sans.jpg");
        }
        realImage.display();
    }
}

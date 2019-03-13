package com.hotmail.huzy8080.library_hu.Pattern.proxy;

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

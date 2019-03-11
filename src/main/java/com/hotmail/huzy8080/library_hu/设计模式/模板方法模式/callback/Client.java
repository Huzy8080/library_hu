package com.hotmail.huzy8080.library_hu.设计模式.模板方法模式.callback;

//模板方法模式，使用了回调
//框架中大量使用这种模式
public class Client {
    public static void main(String[] args) {
        CookCallback cookCallback = new CookCallback(new ProcessHandlerBySaucepan());
        cookCallback.cooking();
    }
}

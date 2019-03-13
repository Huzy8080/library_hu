package com.hotmail.huzy8080.library_hu.Pattern.template.callback;

//template，使用了回调
//框架中大量使用这种模式
public class Client {
    public static void main(String[] args) {
        CookCallback cookCallback = new CookCallback(new ProcessHandlerBySaucepan());
        cookCallback.cooking();
    }
}

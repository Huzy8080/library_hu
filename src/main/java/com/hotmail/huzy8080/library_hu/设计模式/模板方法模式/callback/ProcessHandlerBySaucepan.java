package com.hotmail.huzy8080.library_hu.设计模式.模板方法模式.callback;

public class ProcessHandlerBySaucepan implements ProcessHandler {
    @Override
    public void process() {
        System.out.println("用平底锅做菜");
    }
}

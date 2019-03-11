package com.hotmail.huzy8080.library_hu.设计模式.模板方法模式.genarate;

//子类实现
public class CookByPressureCooker extends Cook {
    @Override
    public void process() {
        System.out.println("用高压锅来做菜");
    }
}

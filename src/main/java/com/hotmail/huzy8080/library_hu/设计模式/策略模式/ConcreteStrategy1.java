package com.hotmail.huzy8080.library_hu.设计模式.策略模式;

/**
 * 具体策略
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1...");
    }
}

package com.hotmail.huzy8080.library_hu.Pattern.strategy;

/**
 * 具体策略
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1...");
    }
}

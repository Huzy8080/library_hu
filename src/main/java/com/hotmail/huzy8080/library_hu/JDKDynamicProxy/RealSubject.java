package com.hotmail.huzy8080.library_hu.JDKDynamicProxy;

/**
 * 真实主题，即要被代理的类
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}

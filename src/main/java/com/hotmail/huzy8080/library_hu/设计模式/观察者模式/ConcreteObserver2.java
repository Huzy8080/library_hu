package com.hotmail.huzy8080.library_hu.设计模式.观察者模式;

public class ConcreteObserver2 implements Observer {

    Subject subject;

    public ConcreteObserver2(Subject subject) {
        this.subject = subject;
        this.subject.registryObserver(this);
    }

    @Override
    public void update() {
        System.out.println("观察者2，收到通知！");
    }
}

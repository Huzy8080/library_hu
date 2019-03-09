package com.hotmail.huzy8080.library_hu.设计模式.观察者模式;

public class ConcreteObserver1 implements Observer {

    Subject subject;

    public ConcreteObserver1(Subject subject) {
        this.subject = subject;
        this.subject.registryObserver(this);
    }

    @Override
    public void update() {
        System.out.println("观察者1，收到通知！");
    }
}

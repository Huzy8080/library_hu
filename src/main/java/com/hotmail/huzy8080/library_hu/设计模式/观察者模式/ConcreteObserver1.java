package com.hotmail.huzy8080.library_hu.设计模式.观察者模式;

public class ConcreteObserver1 implements Observer {
    String name;
    Subject subject;

    public ConcreteObserver1(Subject subject, String name) {
        this.name = name;
        this.subject = subject;
        this.subject.registryObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name + "，收到通知！");
    }

    @Override
    public String getName() {
        return name;
    }
}

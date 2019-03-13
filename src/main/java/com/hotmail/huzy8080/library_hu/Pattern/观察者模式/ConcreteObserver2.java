package com.hotmail.huzy8080.library_hu.Pattern.观察者模式;

public class ConcreteObserver2 implements Observer {
    String name;
    Subject subject;

    public ConcreteObserver2(Subject subject, String name) {
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

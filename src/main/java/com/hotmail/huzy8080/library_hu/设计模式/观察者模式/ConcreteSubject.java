package com.hotmail.huzy8080.library_hu.设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Observer> observerList=new ArrayList<>();

    @Override
    public void registryObserver(Observer o) {
        System.out.println(o.getName() + "注册...");
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(e->e.update());
    }

    public void dataChanage(){
        System.out.println("主题数据发生改变，马上通知所有观察者...");
        notifyObservers();
    }
}

package com.hotmail.huzy8080.library_hu.Pattern.Observer;

public class Client {

    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1(subject, "观察者A");
        Observer observer2 = new ConcreteObserver2(subject, "观察者B");
        ((ConcreteSubject) subject).dataChanage();

    }
}

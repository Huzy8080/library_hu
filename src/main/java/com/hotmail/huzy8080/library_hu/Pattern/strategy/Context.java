package com.hotmail.huzy8080.library_hu.Pattern.strategy;

/**
 * 上下文类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doSomething();
    }
}

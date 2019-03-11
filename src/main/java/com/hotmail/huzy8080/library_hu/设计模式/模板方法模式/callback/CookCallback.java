package com.hotmail.huzy8080.library_hu.设计模式.模板方法模式.callback;

public class CookCallback {

    private ProcessHandler processHandler;

    public CookCallback(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    //模板方法，定义算法框架
    //烹饪
    public void cooking() {
        prepare();//准备工作
        processHandler.process();//回调中间过程
        finish();//完成任务
    }

    protected final void prepare() {
        System.out.println("洗菜...");
    }

    protected final void finish() {
        System.out.println("上菜...");
    }
}

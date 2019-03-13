package com.hotmail.huzy8080.library_hu.Pattern.template.genarate;

//模板类
public abstract class Cook {

    //模板方法，定义算法框架
    //烹饪
    public void cooking() {
        prepare();//准备工作
        process();//中间过程
        finish();//完成任务
    }

    protected final void prepare() {
        System.out.println("洗菜...");
    }

    protected final void finish() {
        System.out.println("上菜...");
    }

    //钩子方法，具体实现交给子类来实现
    public abstract void process();

}

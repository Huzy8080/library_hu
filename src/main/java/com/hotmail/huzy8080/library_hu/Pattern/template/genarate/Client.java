package com.hotmail.huzy8080.library_hu.Pattern.template.genarate;

//典型的模板方法
public class Client {

    public static void main(String[] args) {
        Cook cook = new CookByPressureCooker();
        cook.cooking();

        System.out.println("----------");
        Cook cook1 = new CookBySaucepan();
        cook1.cooking();
    }

}

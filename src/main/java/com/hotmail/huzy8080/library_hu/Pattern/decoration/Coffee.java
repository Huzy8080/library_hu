package com.hotmail.huzy8080.library_hu.Pattern.decoration;

/**
 * 原味咖啡
 */
public class Coffee implements CoffeeMaterial {

    @Override
    public long price() {
        return 10;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}

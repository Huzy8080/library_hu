package com.hotmail.huzy8080.library_hu.Pattern.decoration;

public class Shake implements CoffeeMaterial {

    CoffeeMaterial coffee;

    public Shake(CoffeeMaterial coffee) {
        this.coffee = coffee;
    }

    @Override
    public long price() {
        return 5 + coffee.price();
    }

    @Override
    public String description() {
        return "shake " + coffee.description();
    }
}

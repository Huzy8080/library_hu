package com.hotmail.huzy8080.library_hu.Pattern.decoration;

public class Mocka implements CoffeeMaterial {

    CoffeeMaterial coffee;

    public Mocka(CoffeeMaterial coffee) {
        this.coffee = coffee;
    }

    @Override
    public long price() {
        return 6 + coffee.price();
    }

    @Override
    public String description() {
        return "Mocka " + coffee.description();
    }
}

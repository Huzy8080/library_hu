package com.hotmail.huzy8080.library_hu.Pattern.decoration;

public class Client {

    public static void main(String[] args) {
        System.out.println("一杯磨卡咖啡...");
        System.out.println(new Mocka(new Coffee()).description());
        System.out.println("一杯磨卡双倍奶昔咖啡...");
        System.out.println(new Mocka(new Shake(new Shake(new Coffee()))).description());
    }


}

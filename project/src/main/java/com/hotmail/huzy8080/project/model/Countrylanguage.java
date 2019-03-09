package com.hotmail.huzy8080.project.model;

import org.springframework.stereotype.Component;

@Component
public class Countrylanguage extends CountrylanguageKey {
    private String isofficial;

    private Float percentage;

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
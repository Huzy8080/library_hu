package com.hotmail.huzy8080.project.model;

import org.springframework.stereotype.Component;

@Component
public class CountrylanguageKey {
    private String countrycode;

    private String language;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}
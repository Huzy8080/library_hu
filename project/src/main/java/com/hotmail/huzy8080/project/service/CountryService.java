package com.hotmail.huzy8080.project.service;

import com.hotmail.huzy8080.project.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> findByContinent(String continent);
}

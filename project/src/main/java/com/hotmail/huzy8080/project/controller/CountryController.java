package com.hotmail.huzy8080.project.controller;

import com.hotmail.huzy8080.project.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/find/{continent}")
    public Object findByContinent(@PathVariable("continent") String continent){
        return countryService.findByContinent(continent);
    }
}

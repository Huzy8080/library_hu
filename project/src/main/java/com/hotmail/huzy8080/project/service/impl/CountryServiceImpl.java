package com.hotmail.huzy8080.project.service.impl;

import com.hotmail.huzy8080.project.dao.CountryMapper;
import com.hotmail.huzy8080.project.model.Country;
import com.hotmail.huzy8080.project.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> findByContinent(String continent) {
        //log.info("haha~");
        return countryMapper.findByContinent(continent);
    }
}

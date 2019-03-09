package com.hotmail.huzy8080.project.dao;

import com.hotmail.huzy8080.project.model.Countrylanguage;
import com.hotmail.huzy8080.project.model.CountrylanguageKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountrylanguageMapper {
    int deleteByPrimaryKey(CountrylanguageKey key);

    int insert(Countrylanguage record);

    int insertSelective(Countrylanguage record);

    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    int updateByPrimaryKeySelective(Countrylanguage record);

    int updateByPrimaryKey(Countrylanguage record);
}
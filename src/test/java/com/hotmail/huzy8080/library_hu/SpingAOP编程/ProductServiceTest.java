package com.hotmail.huzy8080.library_hu.SpingAOP编程;

import com.hotmail.huzy8080.library_hu.LibraryHuApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes =  LibraryHuApplication.class)
@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Autowired
    ProductService productService;
    @Test
    public void doSomething() {
        productService.doSomething();

    }
}
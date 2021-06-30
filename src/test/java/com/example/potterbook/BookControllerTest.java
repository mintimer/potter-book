package com.example.potterbook;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void GetPriceWithNoPromotion() {
        BookController bookController = new BookController();
        assertEquals(300,bookController.getPrice(3,0,0,0,0));
    }
}
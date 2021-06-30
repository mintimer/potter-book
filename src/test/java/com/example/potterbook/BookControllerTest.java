package com.example.potterbook;

import org.junit.jupiter.api.DisplayName;
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

    @Test
    public void CountTwoDiff() {
        BookController bookController = new BookController();
        assertEquals(1,bookController.CountTwoDiff(new int[]{0,1,0,1,0}));
    }

    @Test
    public void CountTwoDiff02() {
        BookController bookController = new BookController();
        assertEquals(2,bookController.CountTwoDiff(new int[]{1,2,1,0,0}));
    }

    @Test
    @DisplayName("2 diff books -5%")
    public void GetPriceWithPromotion01() {
        BookController bookController = new BookController();
        assertEquals(190,bookController.getPrice(0,0,1,1,0));
    }
}
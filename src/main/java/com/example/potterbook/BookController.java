package com.example.potterbook;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    public float getPrice(int book1,int book2,int book3,int book4,int book5){
        float price = 0;
        price = (book1 + book2 + book3 + book4 + book5) * 100;
        return price;
    }
}

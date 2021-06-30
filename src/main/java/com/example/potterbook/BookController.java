package com.example.potterbook;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

//    public static void main(String[] args) {
//        CountTwoDiff(new int[]{1,1,1,1,0});
//    }

    public float getPrice(int book1,int book2,int book3,int book4,int book5){
        float price = 0;
        int[] books = new int[]{book1,book2,book3,book4,book5};
        price = (book1 + book2 + book3 + book4 + book5) * 100;
        int twoDiff = CountTwoDiff(books);
        return price;
    }

    public int CountTwoDiff(int[] books) {
        int twoDiff = 0;
        int count = 0;
        int[] temp = new int[]{0,0,0,0,0};
        while (count==0){
            for (int i = 0; i < books.length; i++) {
                if (books[i] > 0 && count < 2){
                    count++;
                    temp[i] = 1;
                }
            }
            if (count < 2) {
                break;
            }else {
                twoDiff++;
                count = 0;
                for (int i = 0; i < books.length; i++) {
                    books[i] -= temp[i];
                    temp[i] = 0;
//                    System.out.print(books[i]+ " ;");
                }
            }
        }

        return twoDiff;
    }
}

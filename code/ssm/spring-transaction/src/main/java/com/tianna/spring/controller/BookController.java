package com.tianna.spring.controller;

import com.tianna.spring.service.BookService;
import com.tianna.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author tiancn
 * @date 2022/8/16 10:56
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void ckeckout(Integer userId,Integer[] bookIds){
        checkoutService.checkout(userId,bookIds);
    }
}

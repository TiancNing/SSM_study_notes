package com.tianna.spring.service.impl;

import com.tianna.spring.dao.BookDao;
import com.tianna.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author tiancn
 * @date 2022/8/16 10:58
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
   /* @Transactional(
            //readOnly = true
            //timeout = 3
            //noRollbackFor = ArithmeticException.class
            //noRollbackForClassName = "java.lang.ArithmeticException"
            //isolation = Isolation.DEFAULT
            propagation = Propagation.REQUIRES_NEW
    )*/
    public void buyBook(Integer userId, Integer bookId) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId,price);
        /*System.out.println(1/0);*/
    }
}

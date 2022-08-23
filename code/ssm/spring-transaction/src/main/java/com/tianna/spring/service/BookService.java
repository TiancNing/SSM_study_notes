package com.tianna.spring.service;

/**
 * @author tiancn
 * @date 2022/8/16 10:57
 */
public interface BookService {
    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}

package com.tianna.spring.service;

/**
 * @author tiancn
 * @date 2022/8/16 23:40
 */
public interface CheckoutService {
    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}

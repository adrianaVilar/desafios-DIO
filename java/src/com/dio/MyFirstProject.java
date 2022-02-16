package com.dio;

import com.dio.base.Order;

/**
 * @author Adriana Vilar
 * @version 1.0.0
 * @see MyFirstProject
 * @since Release 1.0.0
 */

public class MyFirstProject {

    public static void main(String[] args) {
        final Order order = new Order("code1234");

        System.out.println(order);
    }
}
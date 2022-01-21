package com.xidian.factory.simplefactory.pizzastore.order;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author ljz990305
 * @create 2022-01-21 14:00
 */
public class PizzaStore {
    public static void main(String[] args) {
        //1.传统思路
        // OrderPizza orderPaizza = new OrderPizza();

        //2.使用简单工厂
       // new OrderPizza(new SimpleFactory());
       // System.out.println("~~结束~~");

        //3.使用静态工厂模式
        new OrderPizza2();
        System.out.println("~~结束~~");
    }
}

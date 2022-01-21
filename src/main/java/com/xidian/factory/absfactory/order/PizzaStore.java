package com.xidian.factory.absfactory.order;


import com.xidian.factory.factorymethod.pizzastore.order.BJOrderPizza;

/**
 * @author ljz990305
 * @create 2022-01-21 14:00
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
        System.out.println("~~结束~~");
    }
}

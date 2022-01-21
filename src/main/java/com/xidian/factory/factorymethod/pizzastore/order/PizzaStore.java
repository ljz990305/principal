package com.xidian.factory.factorymethod.pizzastore.order;


/**
 * @author ljz990305
 * @create 2022-01-21 14:00
 */
public class PizzaStore {
    public static void main(String[] args) {

        OrderPizza orderPizza = new BJOrderPizza();
        System.out.println("~~结束~~");
    }
}

package com.xidian.factory.simplefactory.pizzastore.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 13:53
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}

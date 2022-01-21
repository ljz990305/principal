package com.xidian.factory.simplefactory.pizzastore.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 13:51
 */
public class ChessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨 准备原材料");
    }
}

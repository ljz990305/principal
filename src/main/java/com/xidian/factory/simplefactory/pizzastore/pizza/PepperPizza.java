package com.xidian.factory.simplefactory.pizzastore.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 13:51
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨 准备原材料");
    }
}

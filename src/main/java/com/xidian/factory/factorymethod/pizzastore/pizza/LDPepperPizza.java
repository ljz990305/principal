package com.xidian.factory.factorymethod.pizzastore.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 15:57
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨  准备原材料");
    }
}

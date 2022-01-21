package com.xidian.factory.factorymethod.pizzastore.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 15:57
 */
public class LDChessesPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨  准备原材料");
    }
}

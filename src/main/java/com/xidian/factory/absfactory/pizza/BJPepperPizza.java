package com.xidian.factory.absfactory.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 15:57
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨  准备原材料");
    }
}

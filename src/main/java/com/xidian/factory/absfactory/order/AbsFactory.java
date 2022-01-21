package com.xidian.factory.absfactory.order;

import com.xidian.factory.absfactory.pizza.Pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 16:32
 */
//一个抽象工程模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来实现
    public Pizza createPizza(String orderType);
}

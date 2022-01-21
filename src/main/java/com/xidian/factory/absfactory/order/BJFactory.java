package com.xidian.factory.absfactory.order;

import com.xidian.factory.absfactory.pizza.Pizza;
import com.xidian.factory.absfactory.pizza.BJChessesPizza;
import com.xidian.factory.absfactory.pizza.BJPepperPizza;

/**
 * @author ljz990305
 * @create 2022-01-21 16:34
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("chesses")){
            pizza = new BJChessesPizza();
            pizza.setName("北京奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}

package com.xidian.factory.absfactory.order;


import com.xidian.factory.absfactory.pizza.*;

/**
 * @author ljz990305
 * @create 2022-01-21 16:34
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("chesses")){
            pizza = new LDChessesPizza();
            pizza.setName("伦敦奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        }
        return pizza;
    }
}

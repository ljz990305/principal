package com.xidian.factory.factorymethod.pizzastore.order;


import com.xidian.factory.factorymethod.pizzastore.pizza.*;

/**
 * @author ljz990305
 * @create 2022-01-21 16:07
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza create(String orderType) {
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

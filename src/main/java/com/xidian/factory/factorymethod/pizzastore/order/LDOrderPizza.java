package com.xidian.factory.factorymethod.pizzastore.order;


import com.xidian.factory.factorymethod.pizzastore.pizza.LDChessesPizza;
import com.xidian.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.xidian.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 16:08
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza create(String orderType) {
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

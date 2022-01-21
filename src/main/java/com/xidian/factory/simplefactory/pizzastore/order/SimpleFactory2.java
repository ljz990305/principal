package com.xidian.factory.simplefactory.pizzastore.order;

import com.xidian.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.xidian.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xidian.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 14:25
 */
public class SimpleFactory2 {
    //静态实现
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("chess")){
            pizza = new ChessPizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new ChessPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}

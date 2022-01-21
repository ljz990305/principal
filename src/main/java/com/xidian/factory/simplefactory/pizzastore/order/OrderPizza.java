package com.xidian.factory.simplefactory.pizzastore.order;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.xidian.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.xidian.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xidian.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

/**
 * @author ljz990305
 * @create 2022-01-21 13:53
 */
public class OrderPizza {
    private Pizza pizza;
    //1.传统思路
    //构造器
    // public OrderPizza(){
    //     String orderType;//订购披萨的类型
    //     do{
    //         orderType = getType();
    //         if(orderType.equals("greek")){
    //             pizza = new GreekPizza();
    //             pizza.setName("希腊披萨");
    //         }else if (orderType.equals("chess")){
    //             pizza = new ChessPizza();
    //             pizza.setName("奶酪披萨");
    //         }else{
    //             break;
    //         }
    //         //输出pizza制作过程
    //         pizza.prepare();
    //         pizza.bake();
    //         pizza.cut();
    //         pizza.box();
    //     }while (true);
    // }


    //2.简单工厂
    private SimpleFactory simpleFactory;
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }
    //通过简单工程创建pizza
    public void setFactory(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory; //设置简单工厂
        String orderType ; //用户输入的类型
        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
            if(pizza != null){//订购成功
                // 输出pizza制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("披萨订购失败！");
                break;
            }
        }while (true);
    }


    //写一个方法获取客户希望订购的披萨种类
    public String getType(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨种类：");
            String type = reader.readLine();
            return type;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}

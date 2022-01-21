package com.xidian.factory.absfactory.order;



import com.xidian.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ljz990305
 * @create 2022-01-21 13:53
 */
public class OrderPizza {
    AbsFactory absFactory;
    private Pizza pizza;
    public OrderPizza(AbsFactory absFactory){
        String orderType;//订购披萨的类型
        this.absFactory = absFactory;
        do{
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
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

package com.xidian.factory.simplefactory.pizzastore.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 13:47
 */
//将Pizza做成抽象类
public abstract class Pizza {
    protected String name;

    //准备原材料，不同的披萨不一样，做成一个抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name+" baking;");
    }
    public void cut(){
        System.out.println(name+" cutting; ");
    }
    public void box(){
        System.out.println(name+" boxing; ");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

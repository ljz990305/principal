package com.xidian.factory.absfactory.pizza;

/**
 * @author ljz990305
 * @create 2022-01-21 15:58
 */
public abstract class Pizza {
    String name;
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

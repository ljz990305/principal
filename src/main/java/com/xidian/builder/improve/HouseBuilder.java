package com.xidian.builder.improve;

/**
 * @author ljz990305
 * @create 2022-01-22 13:42
 */

//抽象的建造者
public abstract class HouseBuilder {
    private House house = new House();

    //约定建造的流程,具体的交给子类来实现
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    //建造好房子之后返回
    public House build(){
        return house;
    }

}

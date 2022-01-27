package com.xidian.builder;

/**
 * @author ljz990305
 * @create 2022-01-22 13:30
 */
public abstract class AbstractHouse {
    public abstract void  buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}

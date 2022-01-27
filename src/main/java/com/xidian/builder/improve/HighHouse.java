package com.xidian.builder.improve;

import com.xidian.builder.AbstractHouse;

/**
 * @author ljz990305
 * @create 2022-01-22 13:50
 */
//具体的建造者
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼封顶");
    }
}

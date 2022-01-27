package com.xidian.builder.improve;

import com.xidian.builder.AbstractHouse;

/**
 * @author ljz990305
 * @create 2022-01-22 13:44
 */
//具体的建造者
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}

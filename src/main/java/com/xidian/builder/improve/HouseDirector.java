package com.xidian.builder.improve;

/**
 * @author ljz990305
 * @create 2022-01-22 13:44
 */
//指挥者
public class HouseDirector {

    private HouseBuilder houseBuilder;

    //构造器传入
    public HouseDirector(CommonHouse houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //set方法传入
    public void setHouseBuilder(HighHouse houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();;
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }

}

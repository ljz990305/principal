package com.xidian.single_ton.single07;

/**
 * @author ljz990305
 * @create 2022-01-21 13:34
 */

/**
 * 使用枚举实现单例模式，没有懒加载
 */
public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.INSTANCE;
        SingleTon instance2 = SingleTon.INSTANCE;
        System.out.println(instance1 == instance2);

    }

}

enum SingleTon{
    INSTANCE;
    public void method(){
        System.out.println("is running");
    }
}
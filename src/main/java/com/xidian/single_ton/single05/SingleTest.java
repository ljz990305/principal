package com.xidian.single_ton.single05;

/**
 * @author ljz990305
 * @create 2022-01-21 12:56
 */
//线程不安全的懒汉式
public class SingleTest {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
class SingleTon{
    private static SingleTon instance;
    private SingleTon(){
    }

    public static SingleTon getInstance(){
        if (instance==null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
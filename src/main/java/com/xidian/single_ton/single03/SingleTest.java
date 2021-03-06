package com.xidian.single_ton.single03;

/**
 * @author ljz990305
 * @create 2022-01-20 18:17
 */

/**
 * 基于双重判断的同步代码块机制实现懒汉式线程安全的单例模式
 */
public class SingleTest {
    public static void main(String[] args) {
        SingleTon01 instance1 = SingleTon01.getInstance();
        SingleTon01 instance2 = SingleTon01.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class SingleTon01{
    //私有静态常量
    private static SingleTon01 instance;

    //构造器私有化，防止外部new产生对象
    private SingleTon01(){

    }

    //给一个public的静态方法，作为访问instance的入口
    public static SingleTon01 getInstance(){
        if(instance == null){
            synchronized (SingleTon01.class){
                if(instance == null){
                    instance = new SingleTon01();
                }
            }
        }
        return instance;
    }

}


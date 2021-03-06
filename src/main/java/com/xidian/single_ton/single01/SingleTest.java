package com.xidian.single_ton.single01;

/**
 * @author ljz990305
 * @create 2022-01-20 18:17
 */

/**
 * 饿汉式，线程安全，可能会有空间浪费(不确定类的装在次数，伴随着类的加载而加载，通过类加载机制保证线程安全)
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
    private static final SingleTon01 instance = new SingleTon01();

    //构造器私有化，防止外部new产生对象
    private SingleTon01(){

    }
    //给一个public的静态方法，作为访问instance的入口
    public static SingleTon01 getInstance(){
        return instance;
    }

}


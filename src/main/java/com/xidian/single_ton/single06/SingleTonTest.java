package com.xidian.single_ton.single06;

/**
 * @author ljz990305
 * @create 2022-01-21 13:18
 */

/**
 * 使用静态内部类实现线程安全懒加载
 * 静态内部类的特点：
 *      ①在外部类被加载的时候静态内部类不会被加载，只有用到静态内部类的时候才会加载===》保证了懒加载
 *      ②类加载机制===》保证了线程安全
 */
public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
class SingleTon{
    private static class SingleTonInstance {
        private static final SingleTon instance = new SingleTon();
    }

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        return SingleTonInstance.instance;
    }

}
package com.xidian.single_ton.single04;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author ljz990305
 * @create 2022-01-20 18:17
 */
public class SingleTest {
    public static void main(String[] args) {
        SingleTon01 instance1 = SingleTon01.getInstance();
        SingleTon01 instance2 = SingleTon01.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class SingleTon01{
    private static final AtomicReference<SingleTon01> INSTANCE = new AtomicReference<>();
    private static SingleTon01 instance;
    private SingleTon01(){

    }

    //给一个public的静态方法，作为访问instance的入口
    public static SingleTon01 getInstance(){
        for (;;){
            SingleTon01 instance = INSTANCE.get();
            if(null != instance)
                return instance;
            INSTANCE.compareAndSet(null, new SingleTon01());
            return INSTANCE.get();
        }
    }

}


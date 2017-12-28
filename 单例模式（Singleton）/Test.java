package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("s1和s2是两个相同的实例");
        }
    }
}

class Singleton{
    // 私有化静态实例，防止被引用。赋值为null，延迟加载
    private static Singleton instance = null;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
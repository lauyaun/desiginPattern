package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


class Singleton1{
    private static Singleton1 instance;
    private Singleton1() {
    }

    public static synchronized Singleton1 getSingleton(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}

class Singleton2{
    private static Singleton2 instance = new Singleton2();
    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}

class Singleton3{
    private static Singleton3 instance;
    static{
        instance = new Singleton3();
    }

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return instance;
    }
}

class Singleton5{

    private static class SinglentonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }
    public static final Singleton5 getInstance(){
        return SinglentonHolder.INSTANCE;
    }
}

 enum Singleton10 {
    INSTNCE;
    public void something(){
    }
}

class Singleton7{
    private volatile static Singleton7 instance;
    private Singleton7(){}

    public static Singleton7 getSingleton(){
        if(instance == null){
            synchronized (Singleton7.class){
                if(instance == null){
                    instance= new Singleton7();
                }
            };
        }
        return instance;
    }
}
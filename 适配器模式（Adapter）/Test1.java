package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test1 {
    public static void main(String[] args) {
        Adaper adaper = new Adaper();
        adaper.operation1();
        adaper.operation2();
    }
}

class Source{
    public void operation1(){
        System.out.println("我是等待适配的方法");
    }
}

interface Target{
    public void operation1();
    public void operation2();
}

class Adaper extends Source implements  Target{

    @Override
    public void operation2() {
        System.out.println("仅仅实现接口的一个方法");
    }
}
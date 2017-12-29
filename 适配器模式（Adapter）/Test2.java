package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test2 {
    public static void main(String[] args) {
        Source source = new Source();
        Adapter adapter = new Adapter(source);
        adapter.operation1();
        adapter.operation2();
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

class Adapter  implements  Target{
    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void operation1() {
        source.operation1();
    }

    @Override
    public void operation2() {
        System.out.println("仅仅实现接口的一个方法");
    }
}
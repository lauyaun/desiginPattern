package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test3 {
    public static void main(String[] args) {
        AdapterA a1 = new AdapterA();
        AdapterB a2 = new AdapterB();
        AdapterC a3 = new AdapterC();

        a1.operation1();
        a1.operation2();

        a2.operation1();
        a2.operation2();

        a3.operation1();
        a3.operation2();
    }
}

interface Sourceable {
    public void operation1();

    public void operation2();
}

abstract class Source implements Sourceable {
    public void operation1() {}
    public void operation2() {}
}


class AdapterA extends Source {

    public void operation1() {
        System.out.println("我只想实现operation1方法");
    }

}


class AdapterB extends Source {

    public void operation2() {
        System.out.println("我只想实现operation2方法");
    }

}

class AdapterC extends Source {

    public void operation1() {
        System.out.println("我乐意实现operation1方法");
    }

    public void operation2() {
        System.out.println("我也可以实现operation2方法");
    }
}
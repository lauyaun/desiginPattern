package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test {
    public static void main(String[] args) {
        TangMonk tangMonk = new TangMonk();
        tangMonk.takeBook();
    }
}

interface Person {
    public void takeBook();
}

class Emperor implements Person {
    public void takeBook() {
        System.out.println("我是皇帝，我要上西天拜佛求经。");
    }
}

class TangMonk implements Person {

    Emperor emperor = new Emperor();

    public void takeBook() {
        emperor.takeBook();
    }
}
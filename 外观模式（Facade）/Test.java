package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade ();
        facade.rainPrecess();
    }
}

class SubSystemA{
    public void wind(){
        System.out.println("风婆扯开皮袋，巽二郎解放口绳,风来了");
    }
}

class SubSystemB{
    public void cloud(){
        System.out.println("推云童子，布雾郎君,云雾皆来");
    }
}

class SubSystemC{
    public void laghtning(){
        System.out.println("雷公奋怒，电母生嗔");
    }
}

class SubSystemD{
    public void rain(){
        System.out.println("龙施号令，雨漫乾坤");
    }
}

class Facade{

    private SubSystemA one = new SubSystemA();
    private SubSystemB two= new SubSystemB();
    private SubSystemC three= new SubSystemC();
    private SubSystemD four = new SubSystemD();

    public void rainPrecess(){
        System.out.println("有人求雨啦！");
        one.wind();
        two.cloud();
        three.laghtning();
        four.rain();
    }
}
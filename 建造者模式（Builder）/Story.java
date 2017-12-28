package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Story {

    public static void main(String[] args){

        Director director = new Director();
        ConcreteTroubleA c1 = new ConcreteTroubleA ();
        director.getProduct(c1);
        System.out.println("再来一个妖精！");
        ConcreteTroubleB c2 = new ConcreteTroubleB ();
        director.getProduct(c2);
    }
}

abstract class Trouble {
    public abstract void getMonster();

    public abstract void getWeapon();

    public abstract void getEatTS();

}

class ConcreteTroubleA extends Trouble {
    public void getMonster() {
        System.out.println("兕大王,");
    }

    public void getWeapon() {
        System.out.println("拿着太上老君的金刚琢,");
    }

    public void getEatTS() {
        System.out.println("大战孙悟空，要吃唐僧肉;");
    }
}

class ConcreteTroubleB extends Trouble {
    public void getMonster() {
        System.out.println("黄眉怪,");
    }

    public void getWeapon() {
        System.out.println("拿着金铙,");
    }

    public void getEatTS() {
        System.out.println("要吃唐僧肉;");
    }
}

class Director{

    public void getProduct(Trouble builder){
        builder.getMonster();
        builder.getWeapon();
        builder.getEatTS();
    }
}
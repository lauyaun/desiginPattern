package com.swc;

/**
 * Created by chao on 2017-11-28.
 */
public class FactoryMethod {

    public static void main(String[] args) {

        MonsterFactory factory = new TAISHANGLAOJUN ();
        ContcreteMonster1  monster1 = (ContcreteMonster1) factory.createMonster();
        monster1.eatTS();

        factory = new MILE ();
        ContcreteMonster2  monster2 = (ContcreteMonster2) factory.createMonster();
        monster2.eatTS();
    }
}

abstract class Monster{

    public void eatTS(){};
}

 class ContcreteMonster1 extends Monster{

    public void eatTS() {
        System.out.println("我是金皘洞兕大王，我要吃唐僧肉，我本是太上老君的青牛。");
    }
}

class ContcreteMonster2 extends Monster{

    public void eatTS() {
        System.out.println("我是黄眉怪，我要吃唐僧肉。我本是弥勒的童儿。");
    }
}

interface MonsterFactory{

    Monster createMonster();
}

 class TAISHANGLAOJUN implements MonsterFactory{


    public Monster createMonster() {
        return new ContcreteMonster1 ();
    }

}

 class MILE implements MonsterFactory{

    public Monster createMonster() {
        return new ContcreteMonster2 ();
    }
}
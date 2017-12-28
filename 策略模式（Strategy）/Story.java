package com.swc;

/**
 * Created by chao on 2017-11-29.
 */
public class Story {
    public static void main(String[] args) {

        Monster monster = new Monster(new ConcreteStrategyA ());
        monster.GiveMeAHeart();

        monster = new Monster(new ConcreteStrategyB());
        monster.GiveMeAHeart();

        monster = new Monster(new ConcreteStrategyC());
        monster.GiveMeAHeart();
    }

}

abstract class Strategy{
    public abstract void changeHeart();
}

class ConcreteStrategyA extends Strategy{

    public  void changeHeart(){
        System.out.println("我是一颗红心");
    }
}

class ConcreteStrategyB extends Strategy{

    public  void changeHeart(){
        System.out.println("我是一颗计较心");
    }
}

class ConcreteStrategyC extends Strategy{

    public void changeHeart(){
        System.out.println("我是一颗利名心");
    }
}

class Monster{

    Strategy strategy ;

    public Monster(Strategy  strategy ){
        this.strategy  = strategy;
    }

    public void GiveMeAHeart(){
        strategy.changeHeart();
    }

}
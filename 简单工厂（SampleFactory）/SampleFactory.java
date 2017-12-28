package com.cnpc.issue.controller;

/**
 * Created by chao on 2017-10-28.
 */
public class SampleFactory {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();
        Monkey  monkey= (Monkey) factory.bringAnimal(1);
        monkey.show();
        Bear bear= (Bear) factory.bringAnimal(2);
        bear.show();
    }
}
abstract class Animal{
    abstract public void show();
}

class Monkey extends Animal{
    public void show() {
        System.out.println("我是一只猴子，我会骑车");
    }
}
class Bear extends Animal{
    public void  show() {
        System.out.println("我是一头熊，我会顶球");
    }
}

class AnimalFactory {

    public Animal  bringAnimal(int id) {
        switch (id) {
            case 1:
                return new Monkey ();
            case 2:
                return new Bear();
            default:
                break;
        }
        return null;
    }
}

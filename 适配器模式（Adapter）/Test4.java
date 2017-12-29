package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test4 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.change();
        monkey.windly();
    }
}

class TieShan{
    public void windly(){
        System.out.println("只有我铁扇公主才能扇灭火");
    }
}

interface Target{
    public void windly();
    public void change();
}

class Monkey extends TieShan implements  Target{

    @Override
    public void change() {
        System.out.println("老孙会七十二变");
    }
}
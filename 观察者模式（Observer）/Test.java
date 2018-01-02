package com.cnpc.supermarket.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2018-1-2.
 */
public class Test {

    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise("乌龟");
        WomenLeader subject = new WomenLeader();
        subject.attach(tortoise);
        subject.notifyObserver("吖，我的瓶子掉海里了！");
    }
}

interface Subject2 {

    public void attach(Observer2 observer);

    public void detach(Observer2 observer);

    public void notifyObserver(String message);
}

class WomenLeader implements Subject2 {

    private List<Observer2> observerList= new ArrayList<Observer2>();

    public void attach(Observer2 observer){
        observerList.add(observer);
    }

    public void detach(Observer2 observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer2 observer : observerList) {
            observer.update(message);
        }
    }

}

interface Observer2 {
    public void update(String message);
}


class Tortoise implements Observer2{

    private String name;

    public Tortoise(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("我是"+name+"，菩萨说："+message+",我得赶紧给捡回来。");
    }
}
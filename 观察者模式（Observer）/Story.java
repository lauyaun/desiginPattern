package com.cnpc.supermarket.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2018-1-2.
 */
public class Story {
    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver("甲同学");
        ConcreteObserver observer2 = new ConcreteObserver("乙同学");
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.notifyObserver("hello,");
    }
}

interface Subject1 {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObserver(String message);
}

class ConcreteSubject implements  Subject1{

    private List<Observer> observerList= new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String message){
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}

interface Observer {
    public void update(String message);
}


class ConcreteObserver implements Observer{

    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name){
        this.name = name;
    }

    public void update(String message) {
        System.out.println(message+name);
    }
}
package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2018-1-2.
 */
public class Test2 {
    public static void main(String[] args) {

        RenshenShu o = new RenshenShu();
        o.setState("开花");
        o.show();

        CareTaker c1= new CareTaker();
        c1.setMemento(o.CreateMemento());

        o.setState("结果");
        o.show();

        CareTaker c2= new CareTaker();
        c2.setMemento(o.CreateMemento());

        o.setState("成熟");
        o.show();

        CareTaker c3= new CareTaker();
        c3.setMemento(o.CreateMemento());

        o.setState("被孙悟空推倒");
        o.show();

        CareTaker c4= new CareTaker();
        c4.setMemento(o.CreateMemento());

        o.setMemento(c3.getMemento());
        o.show();
    }
}
class RenshenShu{
    private String state;

    public Memento CreateMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("我是一棵树，正在"+state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class Memento{
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class CareTaker{
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
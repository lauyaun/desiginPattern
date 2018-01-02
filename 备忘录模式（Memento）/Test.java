package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-4.
 */
public class Test {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("1");
        o.show();

        CareTaker c1= new CareTaker();
        c1.setMemento(o.CreateMemento());

        o.setState("2");
        o.show();

        o.setMemento(c1.getMemento());
        o.show();

    }

}

class Originator{
    private String state;

    public Memento CreateMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("state is "+state);
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
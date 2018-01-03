package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-27.
 */
public class Test2 {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();
        cm.change(new ConcreteColleagueA(cm));
        cm.change(new ConcreteColleagueB(cm));

    }
}

interface Mediator{
    void change(Colleague colleague);
}

abstract class Colleague{
    private Mediator mediator;

    protected Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract  void someOperation();
}

class ConcreteColleagueA extends Colleague{


    protected ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void someOperation(){
        System.out.println("我是同事A");;
    }
}

class ConcreteColleagueB extends Colleague{


    protected ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void someOperation(){
        System.out.println("我是同事B");;
    }
}

class ConcreteMediator implements Mediator{

    private Colleague colleague;

    public void setColleague(Colleague colleague) {
        this.colleague = colleague;
    }

    @Override
    public void change(Colleague colleague) {
        colleague.someOperation();
    }
}
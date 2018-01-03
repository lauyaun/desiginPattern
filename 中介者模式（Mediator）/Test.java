package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-27.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();
        China c = new China("中国",cm);
        USA usa = new USA("美国",cm);
        Russia russia = new Russia("俄罗斯",cm);
        cm.setRussia(russia);
        cm.setChina(c);
        cm.setUsa(usa);
        c.someOperation("我是发展中国家");
        usa.someOperation("我是世界警察，我爱维护和平");
        russia.someOperation("战斗民族，能动手就.....");
    }
}

abstract  class  TheUnitedNations{
    public abstract void constact(String message,Country country);
}

class ConcreteMediator extends TheUnitedNations{

    private China china;
    private USA usa;
    private Russia russia;

    public China getChina() {
        return china;
    }

    public void setChina(China china) {
        this.china = china;
    }

    public USA getUsa() {
        return usa;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public Russia getRussia() {
        return russia;
    }

    public void setRussia(Russia russia) {
        this.russia = russia;
    }

    @Override
    public void constact(String message, Country country) {
        System.out.println("我是"+country.getName()+",我想说"+message);
    }
}

abstract class Country{
    private String name;
    //持有中介者对象的引用，因为每个同事类都应该知道中介者对象
    private TheUnitedNations mediator;

    protected Country(String name ,TheUnitedNations mediator) {
        this.mediator = mediator;
        this.name = name;
    }

    public TheUnitedNations getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class China extends Country{

    public China(String name, TheUnitedNations mediator) {
        super(name, mediator);
    }

    public void someOperation(String message){
        super.getMediator().constact(message,this);
    }
}


class USA extends Country{

    public USA(String name, TheUnitedNations mediator) {
        super(name, mediator);
    }

    public void someOperation(String message){
        super.getMediator().constact(message,this);
    }
}

class Russia extends Country{

    public Russia(String name, TheUnitedNations mediator) {
        super(name, mediator);
    }

    public void someOperation(String message){
        super.getMediator().constact(message,this);
    }
}

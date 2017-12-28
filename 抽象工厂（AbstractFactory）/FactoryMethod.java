package com.swc;

/**
 * Created by chao on 2017-11-28.
 */
public class FactoryMethod {

    public static void main(String[] args) {
        AbstractFactory af = new ConcreteFactory1();
        AbstractBGProduct bg = af.backGroundFactory();
        AbstractEProduct emp = af.Factory();
        bg.backGround();
        emp.employee();

        System.out.println("再来一个妖精");
        af = new ConcreteFactory2();
        bg = af.backGroundFactory();
        emp = af.Factory();
        bg.backGround();
        emp.employee();
    }
}

abstract class AbstractBGProduct{

    public abstract void backGround();
}

 class BGProduct1 extends AbstractBGProduct{

    public void backGround() {
        System.out.println("我是金皘洞兕大王，我要吃唐僧肉，我本是太上老君的青牛。");
    }
}
class BGProduct2 extends AbstractBGProduct{

    public void backGround() {
        System.out.println("我是黄眉怪，我要吃唐僧肉。我本是弥勒的童儿。");
    }
}


abstract class AbstractEProduct{

    public abstract void employee();
}
class EProduct1 extends AbstractEProduct{

    public void employee() {
        System.out.println("我兕大王的小弟有很多。");
    }
}

class EProduct2 extends AbstractEProduct{

    public void employee() {
        System.out.println("孩儿们，你们在那里？");
    }
}

abstract class AbstractFactory{

    public abstract AbstractBGProduct backGroundFactory();
    public abstract AbstractEProduct Factory();
}

class ConcreteFactory1 extends AbstractFactory{


    @Override
    public AbstractBGProduct backGroundFactory() {
        return new BGProduct1();
    }

    @Override
    public AbstractEProduct Factory() {
        return new EProduct1();
    }
}

class ConcreteFactory2 extends AbstractFactory{


    @Override
    public AbstractBGProduct backGroundFactory() {
        return new BGProduct2();
    }

    @Override
    public AbstractEProduct Factory() {
        return new EProduct2();
    }
}
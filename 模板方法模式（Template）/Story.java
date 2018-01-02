package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2018-1-2.
 */
public class Story {
    public static void main(String[] args) {
        CatchMonster c;

        System.out.println("话说唐三藏被兕大王掠去，于是悟空");
        c = new ConcreteCatchMonsterA ();
        c.catchMonster();

        System.out.println("话说唐三藏又被祭赛国九头驸马捉去，于是悟空：");
        c = new ConcreteCatchMonsterB ();
        c.catchMonster();
    }
}
abstract class CatchMonster{
    //固定方法
    public void callTuDi(){
        System.out.println("召唤土地，看看这妖精是啥来头");
    }

    //子类需要实现的方法
    public abstract void arrestMonster();

    //模板方法，定义捉妖套路
    public void catchMonster(){
        callTuDi();
        arrestMonster();
    }
}

class ConcreteCatchMonsterA extends CatchMonster{

    public void arrestMonster(){
        System.out.println("这个妖精是太上老君的青牛，我找他去！让他来降服这厮。");
    }
}

class ConcreteCatchMonsterB extends CatchMonster{

    public void arrestMonster(){
        System.out.println("土地说这个妖精没有后台，直接打他。");
    }
}
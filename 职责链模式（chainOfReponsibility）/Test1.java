package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-4.
 */
public class Test1 {

    public static void main(String[] args) {

        Immortal immortal1 = new NeZha();
        Immortal immortal2 = new WaterMan();
        Immortal immortal3 = new FireMan();
        Immortal immortal4 = new Buddha();
        Immortal immortal5 = new OldMan();

        immortal1.setImmortal(immortal2);
        immortal2.setImmortal(immortal3);
        immortal3.setImmortal(immortal4);
        immortal4.setImmortal(immortal5);

        immortal1.handleRequest();
    }

}

abstract class Immortal{
    private Immortal immortal;

    public void setImmortal(Immortal immortal) {
        this.immortal = immortal;
    }

    public abstract void handleRequest();

    public Immortal getSuccessor(){
        return immortal;
    }
}

class NeZha extends Immortal{
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("我是哪吒，我打不过妖怪了，找人吧");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}

class WaterMan extends Immortal{
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("水德星君，我打不过妖怪，找人吧");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}

class FireMan extends Immortal{
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("火德星君，我打不过妖怪，找人吧");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}

class Buddha extends Immortal{
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("我是佛祖，你去找太上老君");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}

class OldMan extends Immortal{
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("我是太上老君，我打不过妖怪");
            getSuccessor().handleRequest();
        }else{
            System.out.println("这是我的青牛，我来收了他！");
        }
    }
}
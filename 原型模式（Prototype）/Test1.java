package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test1 {
    public static void main(String[] args) {
        Monkey swk = new Monkey();
        swk.setName("悟空");
        Monkey swk2 = swk.clone();
        System.out.println("孙悟空和小猴子是同一个对象么？"+ (swk==swk2));

    }
}

class Monkey implements Cloneable {
    private String name;
    public  Monkey clone(){
        Monkey monkey = null;
        try {
            monkey = (Monkey)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
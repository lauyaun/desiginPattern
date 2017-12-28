package com.cnpc.supermarket.entity;

import java.io.*;

/**
 * Created by chao on 2017-12-28.
 */
public class Test3 {
    public static void main(String[] args) {

        Monkey swk = new Monkey("悟空",new Weapon("如意金箍棒","一万三千五百斤"));
        Monkey monkey1 = null;
        try {
            monkey1 = (Monkey) swk.deepClone();
            System.out.println("孙悟空和小猴子是同一个对象么？回答："+(swk == monkey1));
            System.out.println("孙悟空和小猴子的武器一样么？回答："+(swk.getWeapon() == monkey1.getWeapon()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Monkey implements Cloneable,Serializable {
    private String name;
    private Weapon weapon;

    public Monkey(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public Monkey clone() {
        Monkey Monkey = null;
        try {
            Monkey = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return Monkey;
    }

    public  Monkey deepClone() throws IOException, ClassNotFoundException{
        Monkey monkey = null;
        try {
            monkey = (Monkey) super.clone();
            monkey.setWeapon(monkey.getWeapon().clone());
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}


class Weapon implements Cloneable,Serializable  {

    private String name;
    private String weight;


    public Weapon(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public Weapon clone() {
        Weapon weapon = null;
        try {
            weapon = (Weapon) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test2 {
    public static void main(String[] args) {
        Monkey swk = new Monkey();
        swk.setName("悟空");
        swk.setWeapon(new Weapon("如意金箍棒","一万三千五百斤"));
        Monkey swk2 = (Monkey) swk.clone();
        System.out.println("孙悟空和小猴子是同一个对象么？回答："+(swk == swk2));
        System.out.println("孙悟空和小猴子的武器一样么？回答："+(swk.getWeapon() == swk2.getWeapon()));
    }
}

class Monkey implements Cloneable {
    private String name;
    private Weapon Weapon;

    public Monkey clone() {
        Monkey monkey = null;
        try {
            monkey = (Monkey) super.clone();
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
        return Weapon;
    }

    public void setWeapon(Weapon Weapon) {
        this.Weapon = Weapon;
    }
}


class Weapon implements Cloneable {

    private String name;
    private String weight;


    public Weapon(String name, String weight) {
        this.name = name;
        this.weight = weight;
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
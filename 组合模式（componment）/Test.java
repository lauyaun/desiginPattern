package com.cnpc.supermarket.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2017-12-22.
 */
public class Test {
    public static void main(String [] args) {
        Composite root = new Composite("root",1);
        root.add(new Leaf("Leaf A",1));
        root.add(new Leaf("Leaf B",1));

        Composite comp1 = new Composite("comp1",2);
        root.add(comp1);
        comp1.add(new Leaf("Leaf C",2));
        comp1.add(new Leaf("Leaf D",2));


        Composite comp2 = new Composite("comp2",3);
        comp2.add(new Leaf("Leaf E",3));
        comp2.add(new Leaf("Leaf F",3));
        comp1.add(comp2);

        root.display();
    }
}

abstract class Componment {
    private String name;
    private int depth;

    public Componment(String name,int depth) {
        this.name = name;
        this.depth = depth;
    }

    public abstract void add(Componment c);

    public abstract void remove(Componment c);

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}

class Leaf extends Componment {
    public Leaf(String name, int depth) {
        super(name, depth);
    }

    @Override
    public void add(Componment c) {
        System.out.println("我是叶子节点，无法新增");
    }

    @Override
    public void remove(Componment c) {
        System.out.println("我是叶子节点，无法删除");
    }

    public void display() {
        System.out.println(this.getName()+this.getDepth());
    }
}

class Composite extends Componment {

    private List<Componment> children = new ArrayList<Componment>();

    public Composite(String name, int depth) {
        super(name, depth);
    }

    @Override
    public void add(Componment c) {
        children.add(c);
    }

    @Override
    public void remove(Componment c) {
        children.remove(c);
    }

    @Override
    public void display() {
        for (Componment c : children) {
            c.display();
        }
    }

}


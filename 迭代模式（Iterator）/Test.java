package com.cnpc.healthcenter.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2017-12-4.
 */
public class Test {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("1");
        ag.add("2");
        ag.add("3");
        ag.add("4");
        Iterator it = ag.createIterator();
        while(it.hasNext()){
            String str= (String)it.next();
            System.out.println(str);
        }

    }
}

interface Iterator {
    public Object next();

    public boolean hasNext();

}

class ConcreteIterator implements Iterator {
    private List list = new ArrayList();
    private int index = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index > list.size()) {
            return false;
        } else {
            return true;
        }
    }
}

interface Aggregate {
    public void add(Object o);

    public void remove(Object o);

    public Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public void remove(Object o) {
        list.remove(o);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }

}
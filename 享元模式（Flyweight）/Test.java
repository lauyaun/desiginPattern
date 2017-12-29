package com.cnpc.supermarket.entity;

import java.util.HashMap;

/**
 * Created by chao on 2017-12-26.
 */
public class Test {
    public static void main(String[] args) {
        ShapeFactory.getCircle("红色");
        ShapeFactory.getCircle("蓝色");
        ShapeFactory.getCircle("绿色");
        ShapeFactory.getCircle("绿色");
        ShapeFactory.getCircle("红色");
        ShapeFactory.getCircle("红色");
        System.out.println("对象池的长度为"+ShapeFactory.getMapSize());
    }
}

interface Shape{
    public void operation();
}

class Circle implements  Shape{
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void operation() {
        System.out.println("我是"+color+"的圆形。");
    }
}

class ShapeFactory{

    private static final HashMap<String,Shape> Circles= new HashMap<>();

    public static Shape getCircle(String color){
        Circle c= (Circle)Circles.get(color);
        if(c == null){
            c = new Circle(color);
            Circles.put(color,c);
            c.operation();
        }
        return c;
    }

    public static int getMapSize(){
        return Circles.size();
    }

}


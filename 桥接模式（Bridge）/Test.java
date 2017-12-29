package MybatisDemoA.entity;

/**
 * Created by chao on 2017-12-22.
 */
public class Test {
    public static void main(String[] args) {
        //  红色T-shirt
        Color c = new Red();
        Clothes clothes =new T_shirt();
        clothes.setColor(c);
        c.style();
        clothes.type();

        //蓝色裤子
        Color c1 = new Blue();
        Clothes clothes1 =new Pants();
        clothes1.setColor(c1);
        c1.style();
        clothes1.type();
    }
}

abstract class Clothes {
    Color color = null;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void type();
}

class T_shirt extends Clothes {

    public void type() {
        System.out.println("T-shirt");
    }
}

class Jack extends Clothes {

    public void type() {
        System.out.println("Jack");
    }
}

class Pants extends Clothes {

    public void type() {
        System.out.println("Pants");
    }
}

interface Color {
    public void style();
}

class Red implements Color {

    public void style() {
        System.out.print("我是红色的");
    }
}

class Green implements Color {

    public void style() {
        System.out.print("我是绿色的");
    }
}

class Blue implements Color {
    public void style() {
        System.out.print("我是蓝色的");
    }
}





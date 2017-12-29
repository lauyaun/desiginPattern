package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-28.
 */
public class Test {
    public static void main(String[] args) {
        WhiteBoneMonster monster = new WhiteBoneMonster();
        Daughter daughter = new Daughter(monster);
        Grandma grandma = new Grandma(monster);
        Grandfa grandfa = new Grandfa(monster);

        daughter.eatTS();
        grandma.eatTS();
        grandfa.eatTS();
    }
}

interface Monster {
    public void eatTS();
}

class WhiteBoneMonster  implements Monster {

    public void eatTS(){
        System.out.println("其实我是白骨精，我要吃唐僧肉");
    }
}

 class Daughter implements Monster {

     private  WhiteBoneMonster monster ;

     public  Daughter(WhiteBoneMonster monster){
         this.monster = monster ;
     }

     @Override
     public void eatTS() {
         System.out.println("我是一个翠袖轻摇笼玉笋，湘裙斜拽显金莲的女子");
         monster.eatTS();
         System.out.println("我被孙悟空打死了...");
     }
 }

class Grandma  implements Monster {

    private  WhiteBoneMonster monster ;

    public  Grandma (WhiteBoneMonster monster){
        this.monster = monster ;
    }

    @Override
    public void eatTS() {
        System.out.println("我是年满八旬的老妪，我来找我女儿");
        monster.eatTS();
        System.out.println("我也被孙悟空打死了...");
    }
}

class Grandfa  implements Monster {

    private  WhiteBoneMonster monster ;

    public  Grandfa (WhiteBoneMonster monster){
        this.monster = monster ;
    }

    @Override
    public void eatTS() {
        System.out.println("我是一生好善斋僧，看经念佛的老头");
        monster.eatTS();
        System.out.println("我也被孙悟空打死了...");
    }
}
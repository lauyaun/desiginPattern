package com.cnpc.supermarket.entity;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by chao on 2017-12-26.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c= new Constant(100);

        context.addValue(a,100);
        context.addValue(b,20);


        Expression e = new Div(new Mul(a,b),new Add(new Sub(a,b),c));
        System.out.println("result="+e.interpret(context));
    }
}

class Context{
    private Map valueMap=new HashMap<>();

    public void addValue(Variable x,int y){
        valueMap.put(x,y);
    }

    public int lookValue(Variable x){
        return (int)valueMap.get(x);
    }
}



interface Expression{
    int interpret(Context context);
}

// 常量--终结符表达式
class Constant implements  Expression{

    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context context) {
        return i;
    }
}

// 变量--终结符表达式
class Variable implements Expression{

    @Override
    public int interpret(Context context) {
        return context.lookValue(this);
    }
}


class Add implements Expression{

    private Expression left;
    private Expression right;

    public Add(Expression left,Expression right) {
        this.left = left;
        this.right= right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }
}

class Sub implements Expression{

    private Expression left;
    private Expression right;

    public Sub(Expression left,Expression right) {
        this.left = left;
        this.right= right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)-right.interpret(context);
    }
}

class Mul implements Expression{

    private Expression left;
    private Expression right;

    public Mul(Expression left,Expression right) {
        this.left = left;
        this.right= right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

class Div implements Expression{

    private Expression left;
    private Expression right;

    public Div(Expression left,Expression right) {
        this.left = left;
        this.right= right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)/right.interpret(context);
    }
}


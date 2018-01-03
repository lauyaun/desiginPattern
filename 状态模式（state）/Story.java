package com.swc;

/**
 * Created by chao on 2017-11-29.
 */
public class Story {
    public static void main(String[] args) {
        Context c= new Context(new ConcreteStateA());
        c.Request();
        c.Request();
        c.Request();
        c.Request();
        c.Request();
        c.Request();

    }
}

class Context{
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void Request(){
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
abstract class State{
    public abstract  void handle(Context context);

}

class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        System.out.println("金蝉遭贬第一难，");
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("出胎几杀第二难,");
        context.setState(new ConcreteStateC());
    }
}

class ConcreteStateC extends State{
    @Override
    public void handle(Context context) {
        System.out.println("满月抛江第三难，");
        context.setState(new ConcreteStateD());
    }
}
class ConcreteStateD extends State{
    @Override
    public void handle(Context context) {
        System.out.println("寻亲报冤第四难， ");
        context.setState(new ConcreteStateA());
    }
}
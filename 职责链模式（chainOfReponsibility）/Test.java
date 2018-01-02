package com.cnpc.supermarket.entity;

/**
 * Created by chao on 2017-12-4.
 */
public class Test {

        public static void main(String [] args) {
            Handler handler1 = new ConcreteHandler();
            Handler handler2 = new ConcreteHandler();
            handler1.setSuccessor(handler2);

            handler1.handleRequest();
        }

}

abstract class Handler{
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest();

    public Handler getSuccessor(){
        return successor;
    }
}

class ConcreteHandler extends Handler{

    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}
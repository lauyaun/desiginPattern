package MybatisDemoA.entity;

/**
 * Created by chao on 2017-12-22.
 */
public class Test {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Command command = new ConcreteCommandA(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();

        command = new ConcreteCommandB(receiver);

        invoker = new Invoker(command);

        invoker.action();


        command = new ConcreteCommandC(receiver);

        invoker = new Invoker(command);

        invoker.action();

        command = new ConcreteCommandA(receiver);
        invoker = new Invoker(command);
        invoker.action();
    }
}

class Receiver {

    public void action1() {
        System.out.println("开始记录");
    }

    public void action2() {
        System.out.println("停止记录");
    }

    public void action3() {
        System.out.println("撤销记录");
    }
}

interface Command {
    public void execute();
}

class ConcreteCommandA implements Command {
    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action1();
    }
}

class ConcreteCommandB implements Command {
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action2();
    }
}

class ConcreteCommandC implements Command {
    private Receiver receiver;

    public ConcreteCommandC(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action3();
    }
}

class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}

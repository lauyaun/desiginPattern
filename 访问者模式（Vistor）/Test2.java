package com.cnpc.supermarket.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2017-12-27.
 */
public class Test2 {
    public static void main(String[] args) {
        //消费情况
        Bill consumer1 = new ConsumerBill("支出",1000);
        Bill income1 = new IncomeBill("收入",1000);

        Bill consumer2 = new ConsumerBill("支出",5000);
        Bill income2 = new IncomeBill("收入",10000);

        // 添加账单

        AccountBook ab =new AccountBook();
        ab.add(income1);
        ab.add(consumer1);
        ab.add(consumer2);
        ab.add(income2);
        //访问者
        AccountBookView boy = new Boy();
        AccountBookView girl =new Girl();

        ab.show(boy);
        ab.show(girl);

        ((Boy)boy).getTotalConsumer();
        ((Boy)boy).getTotalIncome();

    }
}

//  账单接口
interface Bill {
    void accept(AccountBookView viewer);
}

//消费

class ConsumerBill implements Bill {
    private String item; //类型
    private double amount; //金钱

    public ConsumerBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void accept(AccountBookView viewer) {
        viewer.view(this);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

// 收入

class IncomeBill implements Bill {
    private String item;
    private double amount;

    public IncomeBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void accept(AccountBookView viewer) {
        viewer.view(this);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}


// 访问者接口
interface AccountBookView {
    void view(ConsumerBill consumerBill);

    void view(IncomeBill incomeBill);
}

// boss
class Boy implements AccountBookView {

    private double totalConsumer;
    private double totalIncome;

    @Override
    public void view(ConsumerBill consumerBill) {
        totalConsumer += consumerBill.getAmount();
    }

    @Override
    public void view(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }

    public void getTotalConsumer() {
        System.out.println("男朋友一共消费了" + totalConsumer+"元");
    }

    public void getTotalIncome() {
        System.out.println("男朋友一共收入了" + totalIncome+"元");
    }

}

//会计类
class Girl implements AccountBookView {
    private int count = 0;

    @Override
    public void view(ConsumerBill consumerBill) {
        count++;
        if(consumerBill.getItem().equals("支出")){
            System.out.println("第"+count+"笔支出，消费了"+consumerBill.getAmount()+"元");

        }
    }

    @Override
    public void view(IncomeBill incomeBill) {
        if(incomeBill.getItem().equals("收入")){
            System.out.println("第"+count+"笔收入，收入了"+incomeBill.getAmount()+"元");

        }
    }
}

// 账单类
class AccountBook{

    private List<Bill> list = new ArrayList<>();
    public void add(Bill bill){
        list.add(bill);
    }

    public void show(AccountBookView view){
        for(Bill b :list){
            b.accept(view);
        }
    }
}
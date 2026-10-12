package cn.dawnlarism.exam.t7p6;

public class Account {
    private String id;
    private double balance;
    private double rate;

    public Account() {

    }

    public Account(String id, double balance, double rate) {
        this.id = id;
        this.balance = balance;
        this.rate = rate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("存入" + amount + ',' + "余额" + this.balance);
        } else {
            System.out.println("存款金额必须大于0");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("取出" + amount + "余额" + this.balance);
        } else {
            System.out.println("余额不足，取款失败，余额不变");
        }
    }

    public void printInfo() {
        System.out.println("账号" + id + "余额" + balance + "利率" + rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}




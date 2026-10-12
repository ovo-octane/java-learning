package cn.dawnlarism.exam.t7p6;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount() {

    }

    public CreditAccount(String id, double balance, double rate, double creditLimit) {
        super(id, balance, rate);
        this.creditLimit = creditLimit;
    }


    @Override
    public void withdraw(double amount) {
        double fee = 0;
        if (amount <= 100 && amount >= 0) {
            fee = 1;
        } else if (amount > 100) {
            fee = amount * 0.01;
        }
        if (amount <= getBalance() + creditLimit - fee && amount >= 0) {
            setBalance(getBalance() - amount - fee);
            System.out.println("取出" + amount + "余额" + getBalance());
        } else {
            System.out.println("超过透支上限，取款失败");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("信用额度" + creditLimit);
    }
}

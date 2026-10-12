package cn.dawnlarism.exam.t7p6;

public class SavingsAccount extends Account {
    //    Account：private 账号、余额；deposit、withdraw、printInfo()；利率用普通成员变量 + getter（不用 protected）
//    SavingsAccount extends Account：加 overdraft，重写 withdraw 允许透支到额度上限
//    CreditAccount extends Account：加 creditLimit，重写 withdraw 允许信用额度内透支 + 手续费（1%，最低 1 元）
//    验收：① 正常存取款正确 ② 余额不足提示且不变 ③ 透支到上限再取被拒 ④ 取 50 → 手续费 1 元、取 500 → 5 元 ⑤ 三个类 printInfo() 都能打印完整信息。
//    为什么值得写：把"继承 + 重写 + super + 封装 + 边界判断"串成一个真实场景；第 11 章学完多态后再改成"父类引用装子类对象"的版本。
    private double overdraft;

    public SavingsAccount() {
        ;
    }

    public SavingsAccount(String id, double balance, double rate, double overdraft) {
        super(id, balance, rate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraft && amount >= 0) {
            setBalance(getBalance() - amount);
            System.out.println("取出" + amount + "余额" + getBalance());
        } else {
            System.out.println("超过透支上限，取款失败");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("透支余额" + overdraft);
    }
}

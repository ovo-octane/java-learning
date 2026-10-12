package cn.dawnlarism.exam.t7p6;

public class test {
//    Account：private 账号、余额；deposit、withdraw、printInfo()；利率用普通成员变量 + getter（不用 protected）
//    SavingsAccount extends Account：加 overdraft，重写 withdraw 允许透支到额度上限
//    CreditAccount extends Account：加 creditLimit，重写 withdraw 允许信用额度内透支 + 手续费（1%，最低 1 元）
//    验收：① 正常存取款正确 ② 余额不足提示且不变 ③ 透支到上限再取被拒 ④ 取 50 → 手续费 1 元、取 500 → 5 元 ⑤ 三个类 printInfo() 都能打印完整信息。
//    为什么值得写：把"继承 + 重写 + super + 封装 + 边界判断"串成一个真实场景；第 11 章学完多态后再改成"父类引用装子类对象"的版本。
static void main(String[] args) {
    Account a = new Account("1001", 1000, 0.003);
    a.deposit(500);     // 存入500.0，余额1500.0
    a.withdraw(200);    // 取出200.0，余额1300.0
    a.withdraw(2000);   // 余额不足，取款失败
    a.printInfo();      // 账号:1001 余额:1300.0 利率:0.003

    SavingsAccount s = new SavingsAccount("2001", 100, 0.015, 500);
    s.withdraw(550);    // 取出550.0，余额-450.0（100+500=600，没超）
    s.withdraw(100);    // 超过透支上限，取款失败（-450-100=-550 < -500）
    s.printInfo();      // 账号:2001 余额:-450.0 利率:0.015 换行 透支额度:500.0

    CreditAccount c = new CreditAccount("3001", 0, 0.005, 10000);
    c.withdraw(50);     // 手续费0.5不足1元按1元收 → 取出50.0，余额-51.0
    c.withdraw(500);    // 手续费5元 → 取出500.0，余额-556.0
    c.printInfo();      // 账号:3001 余额:-556.0 利率:0.005 换行 信用额度:10000.0
}
}

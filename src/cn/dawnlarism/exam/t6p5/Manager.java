package cn.dawnlarism.exam.t6p5;

public class Manager extends Employee{
    //    Manager extends Employee（private bonus + 无参/全参构造，全参构造里 super(name,id,salary)）。
//    验收：new Manager("李四","2026002",12000,3000) 后，
//    用 getter 把四个值打印成一行。 本版不要求 toString()（第 14 章才学）。
    private int bouns;
    public Manager(String name, int age, int salary ,int bouns) {
        super(name,age,salary);
        this.bouns = bouns;
    }
    public Manager(){

    }
    public int getBouns() {
        return bouns;
    }
    public void setBouns(int bouns) {
        this.bouns = bouns;
    }
}

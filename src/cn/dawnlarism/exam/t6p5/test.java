package cn.dawnlarism.exam.t6p5;

import java.util.zip.CheckedOutputStream;

public class test {
//    Employee（private name/id/salary + 无参/全参构造 + getter/setter）→
//    Manager extends Employee（private bonus + 无参/全参构造，全参构造里 super(name,id,salary)）。
//    验收：new Manager("李四","2026002",12000,3000) 后，
//    用 getter 把四个值打印成一行。 本版不要求 toString()（第 14 章才学）。
static void main(String[] args) {
    Manager m=new Manager("李四",2026002,12000,3000);
    System.out.print(m.getAge());
    System.out.print(m.getName());
    System.out.print(m.getBouns());
    System.out.print(m.getSalary());

}
}

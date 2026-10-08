package cn.dawnlarism.exam.t6p5;

public class Employee {
    //    Employee（private name/id/salary + 无参/全参构造 + getter/setter）→
//    Manager extends Employee（private bonus + 无参/全参构造，全参构造里 super(name,id,salary)）。
//    验收：new Manager("李四","2026002",12000,3000) 后，
//    用 getter 把四个值打印成一行。 本版不要求 toString()（第 14 章才学）。
    private String name;
    private int age;
    private int salary;
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){

    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


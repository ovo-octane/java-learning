package cn.dawnlarism.exam.t6p1;

public class Student extends Person {
    String school;

    public Student(String name, long age, String school) {
        super(name, age);
        this.school = school;
    }

    public Student(String school) {
        this.school = school;
    }
    public Student() {};

    @Override
    public void show() {
        System.out.println(name + age + school);
    }
}

package cn.dawnlarism.exam.t6p1;

public class Person {
    //    要求：Person（name、age + show()）+ Student extends Person（school + 重写 show()），
//    两个子类构造都用 super(...)。 验收：new Student("张三",20,"川大").show()
//    输出包含姓名、年龄、学校。 常见错：父类只写了有参构造，子类构造没写
//    super(...) → 编译错误（这题就是要你亲眼看到这个报错）。
    String name;
    long age;
    public Person(){};
    public Person(String name, long age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+age);
    }
}

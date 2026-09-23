package cn.dawnlarism.exam.t6p1;

public class test {
//    要求：Person（name、age + show()）+ Student extends Person（school + 重写 show()），
//    两个子类构造都用 super(...)。 验收：new Student("张三",20,"川大").show()
//    输出包含姓名、年龄、学校。 常见错：父类只写了有参构造，子类构造没写
//    super(...) → 编译错误（这题就是要你亲眼看到这个报错）。
static void main(String[] args) {
    Student s=new Student("张三",20,"川大");
    s.show();
    Person p=new Person();
    p.show();
}
}

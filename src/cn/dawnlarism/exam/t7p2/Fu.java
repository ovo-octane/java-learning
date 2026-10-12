package cn.dawnlarism.exam.t7p2;

public class Fu {
    //    父子类各写同名成员变量 String info，子类方法里分别打印 info、this.info、super.info；父子类各写同名方法 show()，
//    子类里调 show() 和 super.show()。
//    验收：输出各不相同，能解释"就近原则"。
//    注意：父类字段若 private，super.info 不可见；protected 还没学，先用包级可见或 getter 演示。
    String info = "父类的info";

    public void show() {
        System.out.println("父类的show");
    }
}

package cn.dawnlarism.exam.t5p4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    //    题 5-4（B）枚举基础 + switch
//    要求：定义 Season 枚举（春夏秋冬），输入 1~4 输出对应季节，输入其他数字提示错误；再定义 OrderStatus 枚举，用 switch 输出每种状态的中文描述。
//    验收：switch 里用枚举常量；能说出枚举为什么比"用 int 表示状态"更安全。 常见错：switch 的 case 写枚举名字符串（"PAID"）——应写 OrderStatus.PAID。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int a = sc.nextInt();
        Season season;
        switch (a) {
            case 1 -> season = Season.Sping;
            case 2 -> season = Season.Summer;
            case 3 -> season = Season.Autumn;
            case 4 -> season = Season.Winter;
            default -> {
                System.out.println("请输入1-4的数字");
                season=Season.Sping;
            }
        }
        System.out.println(season.getSeason());
    }
}

package cn.dawnlarism.exam.t5p4;

public enum Season {
    //题 5-4（B）枚举基础 + switch
//    要求：定义 Season 枚举（春夏秋冬），输入 1~4 输出对应季节，输入其他数字提示错误；再定义 OrderStatus 枚举
//    用 switch 输出每种状态的中文描述。
//    验收：switch 里用枚举常量；能说出枚举为什么比"用 int 表示状态"更安全。
//    常见错：switch 的 case 写枚举名字符串（"PAID"）——应写 OrderStatus.PAID。
    Sping('春'),
    Summer('夏'),
    Autumn('秋'),
    Winter('冬');
    private char season;

    private Season(char season) {
        this.season = season;
    }

    public char getSeason() {
        return season;
    }

}

package java10;

import java.util.ArrayList;

public class VarTest {

    public static void main(String[] args) {
        //局部变量初始化
        var list = new ArrayList<String>();
        list.add("hello，world！");
        System.out.println(list);

        //for循环内部索引变量
        for (var s : list) {
            System.out.println(s);
        }
        //传统的for循环声明变量
        for (var i = 0; i < list.size(); i++) {
            System.out.println(i);
        }



    }
}

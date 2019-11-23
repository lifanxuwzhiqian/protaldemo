package com.itdr;

public class B11 {
    public static void main(String[]args){
        //1~10整数相加 得到累加值的当前数
        int zong = 0;         //相加的总数
        int i = 1;            //for语句的初始化变量
        for (i=1;i<11;i++){      //输出1~10的整数
            zong = zong+i;        //相加的总数
            System.out.println(i);
            if (zong>20){          //判断相加大于20
                break;              //判断相加大于20，然后跳出循环
            }
        }
    }
}

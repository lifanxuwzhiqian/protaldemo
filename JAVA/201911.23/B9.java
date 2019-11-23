package com.itdr;

import java.util.Scanner;

public class B9 {
    public static void main(String[]args){
        //输入名字 输入5门课成绩 求平均成绩
        Scanner input = new Scanner(System.in);//键盘准备输入工作
        System.out.print("请输入名字");          //输出语句
        String name = input.next();      //字符串的输入
        int i = 1;                        //for语句中的初始化变量
        int zong = 0;                      //总成绩
        for (i=1;i<6;i++){

            System.out.print("第"+i+"成绩");
            int soce = input.nextInt();
            zong=zong+soce;
        }
        System.out.println(zong/5);
    }
}

package com.itdr;

import java.util.Scanner;

public class B3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);//键盘输入
        System.out.print("请输入");            //输出语句
        int mingci = input.nextInt();            //数字输入
        switch (mingci){                      //switch语句
            case 1:
                System.out.println("奖励1000元");
                break;
            case 2:
                System.out.println("奖励500元");
                break;
            default:
                System.out.println("拜拜");
        }
    }
}

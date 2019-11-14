package com.itdr;

import java.util.Scanner;

public class Zhou {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);//准备输入的工作
        System.out.print("请输入数字");          //输出语句
        int day = input.nextInt();             //数字输入
        System.out.println("周："+(day/7));     //输出语句
        System.out.println("天："+(day%7));     //输出语句
    }
}

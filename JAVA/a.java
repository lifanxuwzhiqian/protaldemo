package com.itdr;

import java.util.Scanner;

public class a {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);//准备输入得工作
        System.out.println("请输入：");//输出语句
        int a = input.nextInt();     //数字的输入
        int b = input.nextInt();
        System.out.println("值"+(a+b));//输入语句
    }
}

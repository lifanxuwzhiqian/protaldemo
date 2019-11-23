package com.itdr;

import java.util.Scanner;

public class B8 {
    public static void main(String[]args){
        //whlie语句
        Scanner input = new Scanner(System.in);//键盘录入准备工作
        System.out.println("老师我合格了吗？");   //输出语句
        String w = input.next();              //字符串的输入
        while(w.equals("no")){              //whlie语句
            System.out.println("看书去");
            System.out.println("老师我合格了吗？");
            w = input.next();               //字符串输入
        }
        System.out.println("合格");
    }
}

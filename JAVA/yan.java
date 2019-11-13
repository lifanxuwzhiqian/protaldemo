package com.itdr;

import java.util.Scanner;

public class yan {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);//准备输入的工作
        System.out.print("请输入圆的半径：");     //输出语句
        double r = input.nextInt();            //数字的输入
        System.out.println("圆的面积:"+(3.14*r*r)+"\n圆的周长"+(2*r));//输出语句
    }
}

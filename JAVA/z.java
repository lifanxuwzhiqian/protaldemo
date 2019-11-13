package com.itdr;

import java.util.Scanner;

public class z {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入长：");
        int b = input.nextInt();
        System.out.print("请输入宽：");
        int a = input.nextInt();
        System.out.print("长方形面积：："+(a*b));
    }

}

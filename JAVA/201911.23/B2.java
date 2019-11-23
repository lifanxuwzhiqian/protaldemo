package com.itdr;

import java.util.Scanner;

public class B2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩");
        int score = input.nextInt();
        if (score>=80){
            System.out.println("良好");
        }else if (score>=60){
            System.out.println("中等");
        }else if (score<60){
            System.out.println("差");
        }
    }
}

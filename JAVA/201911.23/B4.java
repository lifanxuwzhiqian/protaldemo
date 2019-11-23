package com.itdr;

import java.util.Scanner;

public class B4 {
    public static void main(String[]args){
        //换购活动
        Scanner input = new Scanner(System.in);//准备键盘输入
        System.out.print("请输入消费金额：");     //输出语句
        double money = input.nextInt();        //数字输入
        System.out.println("是否参加换购：");     //输出语句
        System.out.println("1：满50元，加2元换购百事可乐一瓶");//输出语句
        System.out.println("2：满100元，加3元换购500ml可乐一瓶");//输出语句
        System.out.println("3：满100元，加10元换购5斤面粉");//输出语句
        System.out.println("4：满200元，加10元换购锅");//输出语句
        System.out.println("5：满200元，加20元换购爽肤水");//输出语句
        System.out.println("0：不换购");//输出语句
        System.out.print("请选择：");//输出语句
        int yuanze = input.nextInt();//数字输入
        switch (yuanze){             //switch套if
            case 1:
                if (money>=50){
                    System.out.println("本次消费金额："+(money+2));
                    System.out.println("成功换购小可乐一瓶");
                }else{
                    System.out.println("金额不足 无法换购");
                }
                break;
            case 2:
                if (money>=100){
                    System.out.println("本次消费金额："+(money+3));
                    System.out.println("成功换购大可乐一瓶");
                }else{
                    System.out.println("金额不足 无法换购");
                }
                break;
            case 3:
                if (money>100){
                    System.out.println("本次消费金额："+(money+10));
                    System.out.println("成功换购面粉");
                }else{
                    System.out.println("金额不足 无法换购");
                }
                break;
            case 4:
                if (money>200){
                    System.out.println("本次消费金额："+(money+10));
                    System.out.println("成功换购锅");
                }else{
                    System.out.println("金额不足 无法换购");
                }
                break;
            case 5:
                if (money>200){
                    System.out.println("本次消费金额："+(money+20));
                    System.out.println("成功换购爽肤水");
                }else{
                    System.out.println("金额不足 无法换购");
                }
                break;
            case 0:
                System.out.println("再见");
                break;
        }

    }
}

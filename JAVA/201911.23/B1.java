package com.itdr;

import java.util.Scanner;

public class B1 {
    public static void main(String[]args){
        //取4位会员号百位随机抽奖
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的会员号：");
        int vip = input.nextInt();//键盘数字输入
        int bai = vip/100%10;//取百位
        //Math.random()产生0~1 之间的随机小数
        //java中的强制转换，小数点后面的数字全部干掉
        int suiji = (int)(Math.random()*10);//产生0~9的随机数
        System.out.println("百位:"+bai+"随机:"+suiji);//输出语句
        if (bai==suiji){                      //if语句
            System.out.println("中奖了");
        }else {
            System.out.println("拜拜");
        }
    }
}

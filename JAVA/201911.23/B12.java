package com.itdr;

import java.util.Scanner;

public class B12 {
    public static void main(String[]args){
        //模拟银行3次机会输入账号密码
        Scanner input = new Scanner(System.in);

        for (int i=2;i>=0;i--){
            System.out.print("请输入账户");
            String name =input.next();
            System.out.print("请输入密码");
            int password = input.nextInt();
            if (name.equals("sa")&&password==123){
                System.out.println("欢迎会员");
                break;
            }else {
                System.out.println("账户或密码错误！你还有"+i+"机会\n");

                if (i==0){
                    System.out.println("你3次机会已用完");
                }
            }
        }
    }
}

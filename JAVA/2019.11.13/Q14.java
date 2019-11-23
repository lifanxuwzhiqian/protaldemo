package com.itdr;

import java.util.Scanner;

public class Q14 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("是否有资格(y/n):");
        String yn = input.next();
        if(yn.equals("y")){
            System.out.print("输入性别:");
            String sex = input.next();
            if(sex.equals("男")){
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }
        }else{
            System.out.println("淘汰");
        }
    }


}

package com.itdr;

import java.util.Scanner;

public class Q12 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%2==0){
            System.out.print("奇数");
        }else {
            System.out.print("偶数");
        }

    }
}

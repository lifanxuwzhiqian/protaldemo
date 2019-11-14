package com.itdr;

import java.util.Scanner;

public class Q999 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        for (;a>0;a=a/10){
          b=b+1;
        }
        System.out.print(b);
    }
}

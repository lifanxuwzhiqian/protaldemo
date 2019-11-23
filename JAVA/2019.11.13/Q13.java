package com.itdr;



import java.util.Scanner;

public class Q13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int c =input.nextInt();
        if (c>18){
            System.out.print("成年");
        }else {
            System.out.print("未成年");
        }
    }


}

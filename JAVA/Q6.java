package com.itdr;

public class Q6 {
    public static void main(String[]args){
        int age1 = 24;
        int age2 = 18;
        int age3 = 36;
        int age4 = 27;
        int sum = age1+age2+age3+age4;
        int avg = (age1+age2+age3+age4)/4;
        int minus = age1-age2;
        int newAge = --age1;
        System.out.print("年龄总和"+sum);
        System.out.print("平均年龄"+avg);
        System.out.print("年龄差"+minus);
        System.out.print("自减后的年龄"+newAge);

    }
}

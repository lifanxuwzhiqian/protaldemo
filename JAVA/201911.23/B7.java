package com.itdr;

public class B7 {
    public static void main(String[]args){
        //输出1~100所有奇数的和
        int i = 1;//定义整型变量
        int x = 0;//定义一个奇数和的容器
        while(i<101){      //while语句输出1~100数
            if (i%2!=0){   //if语句拿出1~100奇数
                x = x+i;    //每次奇数和

            }
            i++;
        }
        System.out.println(x);
    }
}

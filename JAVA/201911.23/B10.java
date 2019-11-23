package com.itdr;

public class B10 {
    public static void main(String[]args){
        //1~100不能被3整除的数的和
        int x = 0;                    //不能被3整除的总和
        for (int i=1;i<101;i++){        //for语句输出1~100的数
            if (i%3!=0){                //筛选出不能被3整除的数
                x=x+i;
            }
        }
        System.out.println(x);
    }
}

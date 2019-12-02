package com.MianD;

import java.util.Scanner;

public class FoodDuixiang {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //准备开店  创建类的对象
        Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        //商品的属性  对象的属性
        f1.name =" 萝卜";
        f1.price =100;
        f2.name =" 苹果";
        f2.price =50;
        f3.name =" 香蕉";
        f3.price =25;
        //准备货架将其装起来 （目前只能用数组）
        Food[]arr = new Food[5];
        arr[0] = f1;
        arr[1] = f2;
        arr[2] = f3;

        //通过数组将商品取出来
        for(int i=0;i<arr.length;i++){
            if (arr[i] !=null ){
                System.out.println("商品序号："+i+"\n商品名称："+arr[i].name+"\n商品价格"+arr[i].price);
            }
        }
        //顾客选择商品
        System.out.println("请选择自己的商品：");
        int m = input.nextInt();
        if (m<arr.length&&m>=0){
            System.out.println("商品序号："+m+"\n商品名称："+arr[m].name+"\n商品价格"+arr[m].price);
        }else {
            System.out.println("你输入的序号有误");
        }
        f3.cj();
    }
}
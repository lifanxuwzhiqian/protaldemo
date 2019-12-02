package com.AnLi.An1;

import java.util.Scanner;

public class CeShi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User[] arr = new User[10];//保存对象的值
        CS[] ss = new CS[36];
        CS d = new CS("生肖", "鼠", "老鼠");
        ss[0] = d;
        CS d1 = new CS("生肖", "马", "跑到快");
        ss[1] = d1;
        CS d2 = new CS("月份", "1", "黄金");
        ss[2] = d2;
        CS d3 = new CS("月份", "2", "砖石");
        ss[4] = d3;
        CS d4 = new CS("星座", "狮子座", "7月份");
        ss[5] = d4;
        System.out.println("用户注册：");
        System.out.print("请输入姓名：");
        String name = input.next();
        System.out.print("请输入密码：");
        int pas = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        System.out.print("请输入生肖：");
        String sx = input.next();
        System.out.print("请输入星座：");
        String xz = input.next();
        int m = register(name, pas, month, sx, xz, arr);//调用register方法 register();
        if (m == 1) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }


        System.out.print("用户名：");
        String name1 = input.next();
        System.out.print("用户密码：");
        int pas1 = input.nextInt();
        int w = dl(name1, pas, arr);
        if (w == 1) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        //用户测试
        System.out.print("请输入生肖：");
        String sx1 = input.next();
        System.out.print("请输入月份：");
        String mon1 = input.next();
        System.out.print("请输入星座：");
        String xz1 = input.next();
        String newname = cs(sx1,mon1,xz1, ss);
        System.out.println("你的：" + newname);


    }

    //用户注册                        //参数的传递
    public static int register(String name, int pas, int month, String sx, String xz, User[] ua) {
        //用户注册需要创建一个用户对象
        User u = new User();
        //给用户对象赋值
        u.name = name;
        u.pas = pas;
        u.month = month;
        u.sx = sx;
        u.xz = xz;
        //用数组保存对象
        for (int i = 0; i < ua.length; i++) {
            if (ua[i] == null) {
                ua[i] = u;
                return 1;
            }
        }
        return -1;//为什么 return -1; 放在循环外面？因为for循环的次数结束后，如果还未有一个符合的值，那么必须的返回一个值，所以写在循坏外面
    }

    //用户登录
    public static int dl(String name, int pas, User[] ua) {
        for (int i = 0; i < ua.length; i++) {
            if (ua[i] != null) {
                if (ua[i].name.equals(name) && ua[i].pas == pas) {
                    return 1;
                }
            }
        }
        return -1;
    }

    //用户测试
    public static String cs(String sx, String mon, String xz, CS[] SSS) {
        String newname = "";
        for (int i = 0; i < SSS.length; i++) {
            if (SSS[i] != null) {
                if (SSS[i].shuju.equals("生肖")) {
                    if (SSS[i].x.equals(sx)) {
                        newname = newname + SSS[i].y;
                    }
                }

                if (SSS[i].shuju.equals("月份")) {
                    if (SSS[i].x.equals(mon)) {
                        newname = newname + SSS[i].y;
                    }
                }
                if (SSS[i].shuju.equals("星座")) {
                    if (SSS[i].x.equals(xz)) {
                        newname = newname + SSS[i].y;
                    }
                }
            }
        }
        return newname;
    }
}
